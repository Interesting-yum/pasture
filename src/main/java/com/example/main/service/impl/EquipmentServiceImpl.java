package com.example.main.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.main.mapper.EquipmentMapper;
import com.example.main.model.entity.Equipment;
import com.example.main.service.intf.EquipmentService;

@Service
public class EquipmentServiceImpl extends ServiceImpl<EquipmentMapper, Equipment> implements EquipmentService {

    @Override
    public int batchInsert(List<Equipment> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int updateBatch(List<Equipment> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Equipment> list) {
        return baseMapper.updateBatchSelective(list);
    }
}

