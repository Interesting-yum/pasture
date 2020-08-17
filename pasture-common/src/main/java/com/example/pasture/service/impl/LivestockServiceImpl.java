package com.example.pasture.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.pasture.mapper.LivestockMapper;
import com.example.pasture.model.entity.Livestock;
import com.example.pasture.service.intf.LivestockService;
@Service
public class LivestockServiceImpl extends ServiceImpl<LivestockMapper, Livestock> implements LivestockService{

    @Override
    public int updateBatch(List<Livestock> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<Livestock> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<Livestock> list) {
        return baseMapper.batchInsert(list);
    }
}
