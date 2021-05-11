package com.swp.service;

import com.swp.common.CommonResult;
import com.swp.model.condition.UserListCondition;
import com.swp.model.condition.UserLoginCondition;
import com.swp.model.condition.UserRegisterCondition;
import com.swp.model.dto.UserDTO;
import com.swp.model.dto.UserDetailsDTO;
import com.swp.model.dto.UserListDTO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.io.IOException;
import java.util.List;

/**
 * @author wanping.sheng
 * @Filename UserService
 * @description
 * @Version 1.0
 * @History <li>Author: wanping.sheng</li>
 * <li>Date: 2021/3/1 16:34</li>
 * <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
@Validated
public interface UserService {

    /**
     * ��¼��֤
     * @param condition
     */
    CommonResult login(@Valid UserLoginCondition condition);

    /**
     * ����˵�¼��֤
     * @param condition
     */
    CommonResult adminLogin(@Valid UserLoginCondition condition);

    /**
     * ע��
     * @param condition
     */
    CommonResult save(@Valid UserRegisterCondition condition) throws IOException;

    /**
     * �û�����
     * @param condition
     * @return
     */
    List<UserListDTO> ListData(UserListCondition condition);

    /**
     * ɾ��
     * @param id
     */
    void delete(Long id);

    /**
     * �޸�״̬
     * @param id
     * @param Status
     */
    void updateStatus(Long id, Integer Status);

    /**
     * �û��������
     * @return
     */
    List<UserDetailsDTO> getUserDetails(UserListCondition condition);
}
