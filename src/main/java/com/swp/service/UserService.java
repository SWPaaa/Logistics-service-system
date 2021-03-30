package com.swp.service;

import com.swp.common.CommonResult;
import com.swp.model.condition.UserLoginCondition;
import com.swp.model.condition.UserRegisterCondition;
import com.swp.model.dto.UserDTO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.io.IOException;

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
     * µÇÂ¼ÑéÖ¤
     * @param condition
     */
    CommonResult login(UserLoginCondition condition);

    /**
     * ×¢²á
     * @param condition
     */
    CommonResult save(@Valid UserRegisterCondition condition) throws IOException;
}
