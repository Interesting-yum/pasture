package com.example.pasture.service.intf;

import java.util.List;
import com.example.pasture.model.Do.User;
import com.baomidou.mybatisplus.extension.service.IService;
public interface UserService extends IService<User>{


    int updateBatch(List<User> list);

    int updateBatchSelective(List<User> list);

    int batchInsert(List<User> list);

}
