package com.example.pasture.service.intf;

import com.example.pasture.model.entity.Pasture;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;
public interface PastureService extends IService<Pasture>{


    int updateBatch(List<Pasture> list);

    int updateBatchSelective(List<Pasture> list);

    int batchInsert(List<Pasture> list);

}
