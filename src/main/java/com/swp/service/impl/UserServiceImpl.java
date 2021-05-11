package com.swp.service.impl;

import com.swp.Enum.UserStatusEnum;
import com.swp.Enum.UserTypeEnum;
import com.swp.common.CommonErrorEnum;
import com.swp.common.CommonResult;
import com.swp.entity.UserEntity;
import com.swp.model.condition.UserListCondition;
import com.swp.model.condition.UserLoginCondition;
import com.swp.model.condition.UserRegisterCondition;
import com.swp.model.dto.UserAdminLoginDTO;
import com.swp.model.dto.UserDTO;
import com.swp.dao.UserDao;
import com.swp.model.dto.UserDetailsDTO;
import com.swp.model.dto.UserListDTO;
import com.swp.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author wanping.sheng
 * @Filename UserServiceImpl
 * @description
 * @Version 1.0
 * @History <li>Author: wanping.sheng</li>
 * <li>Date: 2021/3/1 16:33</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@Service("userService")
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    /**
     * 登录验证
     * @param condition
     */
    @Override
    public CommonResult login(UserLoginCondition condition) {
        // 获取数据并加密
        UserDTO userDTO = userDao.login(condition);
        String encrypt = DigestUtils.md5DigestAsHex((condition.getPassword()+userDTO.getSalt()).getBytes());
        // 验证
        if(userDTO == null){
            return new CommonResult(CommonErrorEnum.NO_USERNAME);
        }else if(!userDTO.getPassword().equals(encrypt)){
            return new CommonResult(CommonErrorEnum.NO_USERNAME);
        }else if(userDTO.getStatus().equals(UserStatusEnum.NO_AUDIT.value())){
            return new CommonResult(CommonErrorEnum.STATUS_IS_NO);
        }else if(userDTO.getStatus().equals(UserStatusEnum.UNAPPROVE.value())){
            return new CommonResult(CommonErrorEnum.UNAPPROVE);
        }

        return CommonResult.ok(userDTO);
    }

    /**
     * 管理端登录验证
     * @param condition
     * @return
     */
    @Override
    public CommonResult adminLogin(UserLoginCondition condition) {

        List<UserAdminLoginDTO> list = userDao.adminLogin(condition);
        List<UserAdminLoginDTO> tree = new ArrayList<>();

        if(list.size() == 0){
            return new CommonResult(CommonErrorEnum.NO_USERNAME);
        }else{
            String encrypt = DigestUtils.md5DigestAsHex((condition.getPassword()+list.get(0).getSalt()).getBytes());
            if(!list.get(0).getPassword().equals(encrypt)){
                return new CommonResult(CommonErrorEnum.NO_USERNAME);
            }else if(list.get(0).getStatus().equals(UserStatusEnum.NO_AUDIT.value())){
                return new CommonResult(CommonErrorEnum.STATUS_IS_NO);
            }else if(list.get(0).getStatus().equals(UserStatusEnum.UNAPPROVE.value())){
                return new CommonResult(CommonErrorEnum.UNAPPROVE);
            }

            // 获取树形菜单
            for (UserAdminLoginDTO user : list) {
                //找到根节点
                if (user.getParentId().equals(0L)) {
                    tree.add(user);
                }
                List<UserAdminLoginDTO> children = new ArrayList<>();
                //再次遍历list，找到user的子节点
                for (UserAdminLoginDTO node : list) {
                    // 寻找当前数据的所有直系子数据
                    if (node.getParentId().equals(user.getMenuId())) {
                        children.add(node);
                    }
                }
                // 把子节点放到父节点内
                user.setChild(children);
            }
        }

        return CommonResult.ok(tree);
    }

    /**
     * 注册
     * @param condition
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public CommonResult save(UserRegisterCondition condition) throws IOException {
        if(userDao.getByUsername(condition.getUsername()) != null){
            return new CommonResult(CommonErrorEnum.HAVE_USERNAME);
        }

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/");
        // 比如：/2021/03/11
        String format = sdf.format(new Date());
        //  new File("").getCanonicalPath()获取本地服务器路径，加上保存目录路径
        String path = "D:\\LogisticsServiceSystem\\Server\\LogisticsServiceSystem\\src\\main\\webapp\\images\\";
        File folder = new File(path + format);
        // 不是一个目录的时候
        if (!folder.isDirectory()) {
            //建立一个子目录
            folder.mkdirs();
        }
        //  文件保存路径和保存的文件名
        File filePath= new File(folder,condition.getFile().getOriginalFilename());
        try {
            // 文件保存
            condition.getFile().transferTo(filePath);
        } catch (IOException e) {
            log.error("保存失败", e);
        }

        condition.setName(condition.getUsername());
        condition.setCompanyUrl("http://localhost:8080/images/"+ format+condition.getFile().getOriginalFilename());
        // 存到entity
        UserEntity entity = new UserEntity();
        BeanUtils.copyProperties(condition, entity);
        entity.setSex(condition.getSex().value());
        entity.setType(condition.getType().value());
        // 密码加密
        // secureRandom是比Random安全的随机数
        SecureRandom sr1 = new SecureRandom();
        // 生成6位随机数，sr1.nextInt(900000)是生成900000以内的随机数
        entity.setSalt(String.valueOf(sr1.nextInt(900000) + 100000));
        // 密码加随机生成的盐确保加密后的密文唯一性
        entity.setPassword(DigestUtils.md5DigestAsHex((condition.getPassword()+entity.getSalt()).getBytes()));
        // 保存
        userDao.save(entity);

        return CommonResult.ok();
    }

    /**
     * 用户管理
     * @param condition
     * @return
     */
    @Override
    public List<UserListDTO> ListData(UserListCondition condition) {
        return userDao.ListData(condition.getUsername(), condition.getIndex(), condition.getCount());
    }

    /**
     * 删除
     * @param id
     */
    @Override
    public void delete(Long id) {
        userDao.delete(id);
    }

    /**
     * 修改状态
     * @param id
     * @param Status
     */
    @Override
    public void updateStatus(Long id, Integer Status) {
        userDao.updateStatus(id, Status);
    }

    /**
     * 用户审核详情
     * @return
     */
    @Override
    public List<UserDetailsDTO> getUserDetails(UserListCondition condition) {
        return userDao.getUserDetails(condition.getUsername(), condition.getIndex(), condition.getCount());
    }


}
