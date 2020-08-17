package com.example.pasture.service.intf;

import java.util.List;
import com.example.pasture.model.entity.Relation;
import com.baomidou.mybatisplus.extension.service.IService;
public interface RelationService extends IService<Relation>{


    int updateBatch(List<Relation> list);

    int updateBatchSelective(List<Relation> list);

    int batchInsert(List<Relation> list);

}
