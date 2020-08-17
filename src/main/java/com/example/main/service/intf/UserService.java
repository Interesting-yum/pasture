package com.example.main.service.intf;

import java.util.List;
import com.example.main.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
public interface UserService extends IService<User>{


    int updateBatch(List<User> list);

    int updateBatchSelective(List<User> list);

    int batchInsert(List<User> list);

}
