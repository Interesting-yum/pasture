package com.example.pasture.service.intf;

import com.example.pasture.model.Dto.UserDto;
import com.example.pasture.model.Vo.LoginVo;

/**
 * @ClassName UserService
 * @Description 用户服务接口
 * @Author LY
 * @Date 2020/08/03 01:11:26
 * @Version 1.0
 */
public interface UserService {
    UserDto login(LoginVo vo);
}
