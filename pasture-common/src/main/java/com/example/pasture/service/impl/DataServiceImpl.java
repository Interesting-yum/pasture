package com.example.pasture.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.pasture.mapper.DataMapper;
import com.example.pasture.model.Do.Data;
import com.example.pasture.service.intf.DataService;
@Service
public class DataServiceImpl extends ServiceImpl<DataMapper, Data> implements DataService{

    @Override
    public int updateBatch(List<Data> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<Data> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<Data> list) {
        return baseMapper.batchInsert(list);
    }
}
