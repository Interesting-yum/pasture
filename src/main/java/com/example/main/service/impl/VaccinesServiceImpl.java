package com.example.main.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.main.mapper.VaccinesMapper;
import com.example.main.model.entity.Vaccines;
import com.example.main.service.intf.VaccinesService;
@Service
public class VaccinesServiceImpl extends ServiceImpl<VaccinesMapper, Vaccines> implements VaccinesService{

    @Override
    public int updateBatch(List<Vaccines> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<Vaccines> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<Vaccines> list) {
        return baseMapper.batchInsert(list);
    }
}
