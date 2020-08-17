package com.example.main.service.intf;

import com.example.main.model.entity.Livestock;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;
public interface LivestockService extends IService<Livestock>{


    int updateBatch(List<Livestock> list);

    int updateBatchSelective(List<Livestock> list);

    int batchInsert(List<Livestock> list);

}
