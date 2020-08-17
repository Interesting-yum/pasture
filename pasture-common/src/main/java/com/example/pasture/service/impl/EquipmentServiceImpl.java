package com.example.pasture.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.pasture.model.entity.Equipment;
import com.example.pasture.mapper.EquipmentMapper;
import com.example.pasture.service.intf.EquipmentService;

@Service
public class EquipmentServiceImpl extends ServiceImpl<EquipmentMapper, Equipment> implements EquipmentService {

    @Override
    public int updateBatch(List<Equipment> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Equipment> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Equipment> list) {
        return baseMapper.batchInsert(list);
    }
}

