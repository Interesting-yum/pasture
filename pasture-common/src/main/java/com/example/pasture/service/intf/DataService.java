package com.example.pasture.service.intf;

import java.util.List;
import com.example.pasture.model.entity.Data;
import com.baomidou.mybatisplus.extension.service.IService;
public interface DataService extends IService<Data>{


    int updateBatch(List<Data> list);

    int updateBatchSelective(List<Data> list);

    int batchInsert(List<Data> list);

}
