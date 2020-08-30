package com.example.pasture.controller;

import com.example.pasture.model.Dto.UserDto;
import com.example.pasture.model.Vo.LoginVo;
import com.example.pasture.service.intf.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Description 用户控制类
 * @Author LY
 * @Date 2020/08/03 01:11:26
 * @Version 1.0
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 登录
     * @param vo 登录参数对象
     * @return UserDto 用户数据传输对象
     */
    @RequestMapping("/login")
    public UserDto login(@RequestBody LoginVo vo){
        return userService.login(vo);
    }
}
