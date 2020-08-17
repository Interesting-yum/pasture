package com.example.main.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.main.model.entity.User;
import com.example.main.mapper.UserMapper;
import com.example.main.service.intf.UserService;
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService{

    @Override
    public int updateBatch(List<User> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<User> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<User> list) {
        return baseMapper.batchInsert(list);
    }
}
