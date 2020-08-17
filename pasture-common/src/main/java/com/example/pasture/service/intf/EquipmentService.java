package com.example.pasture.service.intf;

import com.example.pasture.model.entity.Equipment;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;
public interface EquipmentService extends IService<Equipment>{


    int updateBatch(List<Equipment> list);

    int updateBatchSelective(List<Equipment> list);

    int batchInsert(List<Equipment> list);

}
