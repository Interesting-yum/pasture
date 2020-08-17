package com.example.pasture.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.pasture.mapper.RelationMapper;
import com.example.pasture.model.entity.Relation;
import com.example.pasture.service.intf.RelationService;
@Service
public class RelationServiceImpl extends ServiceImpl<RelationMapper, Relation> implements RelationService{

    @Override
    public int updateBatch(List<Relation> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<Relation> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<Relation> list) {
        return baseMapper.batchInsert(list);
    }
}
