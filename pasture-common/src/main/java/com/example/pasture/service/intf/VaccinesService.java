package com.example.pasture.service.intf;

import java.util.List;
import com.example.pasture.model.Do.Vaccines;
import com.baomidou.mybatisplus.extension.service.IService;
public interface VaccinesService extends IService<Vaccines>{


    int updateBatch(List<Vaccines> list);

    int updateBatchSelective(List<Vaccines> list);

    int batchInsert(List<Vaccines> list);

}
