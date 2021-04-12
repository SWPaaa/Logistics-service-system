package com.swp.service.impl;

import com.swp.Enum.UserStatusEnum;
import com.swp.Enum.UserTypeEnum;
import com.swp.common.CommonErrorEnum;
import com.swp.common.CommonResult;
import com.swp.entity.UserEntity;
import com.swp.model.condition.UserLoginCondition;
import com.swp.model.condition.UserRegisterCondition;
import com.swp.model.dto.UserDTO;
import com.swp.dao.UserDao;
import com.swp.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

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

        UserDTO userDTO = userDao.login(condition);

        if(userDTO == null){
            return new CommonResult(CommonErrorEnum.NO_USERNAME);
        }else if(userDTO.getStatus().equals(UserStatusEnum.NO_AUDIT.value())){
            return new CommonResult(CommonErrorEnum.STATUS_IS_NO);
        }else if(userDTO.getStatus().equals(UserStatusEnum.UNAPPROVE.value())){
            return new CommonResult(CommonErrorEnum.UNAPPROVE);
        }

        return CommonResult.ok(userDTO);

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
        //  new File("").getCanonicalPath()获取本地项目路径，加上保存目录路径
        String path = new File("").getCanonicalPath()+ "/upload/";
        // 路径加上日期作为一个目录
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
        condition.setCompanyUrl(path+ format+condition.getFile().getOriginalFilename());
        // 存到entity
        UserEntity entity = new UserEntity();
        BeanUtils.copyProperties(condition, entity);
        entity.setSex(condition.getSex().value());
        entity.setType(condition.getType().value());
        System.out.println(entity);
        // 保存
        userDao.save(entity);

        return CommonResult.ok();
    }

}
