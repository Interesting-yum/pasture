package com.example.pasture.mapper;

import com.example.pasture.model.Do.User;
import com.example.pasture.model.Vo.LoginVo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName UserDao
 * @Description 用户数据接口
 * @Author LY
 * @Date 2020/08/03 01:11:26
 * @Version 1.0
 */
@Mapper
public interface UserDao {
    User login(LoginVo vo);
}
