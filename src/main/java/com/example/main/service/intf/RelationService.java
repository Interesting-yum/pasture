package com.example.main.service.intf;

import com.example.main.model.entity.Relation;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;
public interface RelationService extends IService<Relation>{


    int updateBatch(List<Relation> list);

    int updateBatchSelective(List<Relation> list);

    int batchInsert(List<Relation> list);

}
