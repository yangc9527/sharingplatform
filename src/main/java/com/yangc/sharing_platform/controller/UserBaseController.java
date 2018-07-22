package com.yangc.sharing_platform.controller;

import com.yangc.sharing_platform.data.UserRegisterBody;
import com.yangc.sharing_platform.service.UserBaseService;
import com.yangc.sharing_platform.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户相关的一些基本操作
 */
@RestController
@RequestMapping("/user/base")
public class UserBaseController {

    private UserBaseService userBaseService;

    @Autowired
    public UserBaseController(UserBaseService userBaseService) {

        this.userBaseService = userBaseService;

    }

    /**
     * 用户注册
     *
     * @param data 注册信息
     * @return result
     */
    @RequestMapping(value = "register", method = RequestMethod.POST)
    public Result<?> register(UserRegisterBody data) {

        return Result.result(userBaseService.register(data));
    }


    /**
     * 用户登录接口
     *
     * @param account  用户账号
     * @param password 用户密码
     * @return 用户账户详细信息
     */
    @RequestMapping(value = "login", method = RequestMethod.GET)
    public Result<?> login(@RequestParam("account") String account,
                           @RequestParam("password") String password) {

        return Result.result(userBaseService.login(account, password));
    }

}
