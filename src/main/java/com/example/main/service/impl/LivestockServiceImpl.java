package com.example.main.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.main.model.entity.Livestock;
import com.example.main.mapper.LivestockMapper;
import com.example.main.service.intf.LivestockService;
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
