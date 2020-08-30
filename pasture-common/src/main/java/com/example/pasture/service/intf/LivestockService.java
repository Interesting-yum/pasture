package com.example.pasture.service.intf;

import java.util.List;
import com.example.pasture.model.Do.Livestock;
import com.baomidou.mybatisplus.extension.service.IService;
public interface LivestockService extends IService<Livestock>{


    int updateBatch(List<Livestock> list);

    int updateBatchSelective(List<Livestock> list);

    int batchInsert(List<Livestock> list);

}
