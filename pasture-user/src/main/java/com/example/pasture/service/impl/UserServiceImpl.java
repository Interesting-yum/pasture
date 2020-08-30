package com.example.pasture.service.impl;

import com.example.pasture.mapper.UserDao;
import com.example.pasture.model.Do.User;
import com.example.pasture.model.Dto.UserDto;
import com.example.pasture.model.Vo.LoginVo;
import com.example.pasture.service.intf.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @ClassName UserServiceImpl
 * @Description 用户服务接口实现类
 * @Author LY
 * @Date 2020/08/03 01:11:26
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    /**
     * 登录
     * @param vo
     * @return
     */
    @Override
    public UserDto login(LoginVo vo) {
        User user = userDao.login(vo);
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(user,userDto);
        return userDto;
    }
}
