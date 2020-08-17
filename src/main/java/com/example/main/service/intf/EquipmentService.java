package com.example.main.service.intf;

import java.util.List;
import com.example.main.model.entity.Equipment;
import com.baomidou.mybatisplus.extension.service.IService;

public interface EquipmentService extends IService<Equipment> {


    int batchInsert(List<Equipment> list);

    int updateBatch(List<Equipment> list);

    int updateBatchSelective(List<Equipment> list);
}

