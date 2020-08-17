package com.example.main.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.main.model.entity.Pasture;
import com.example.main.mapper.PastureMapper;
import com.example.main.service.intf.PastureService;
@Service
public class PastureServiceImpl extends ServiceImpl<PastureMapper, Pasture> implements PastureService{

    @Override
    public int updateBatch(List<Pasture> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<Pasture> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<Pasture> list) {
        return baseMapper.batchInsert(list);
    }
}
