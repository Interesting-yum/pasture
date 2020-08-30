package com.example.pasture.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.pasture.mapper.FileMapper;
import com.example.pasture.model.Do.File;
import com.example.pasture.service.intf.FileService;
@Service
public class FileServiceImpl extends ServiceImpl<FileMapper, File> implements FileService{

    @Override
    public int updateBatch(List<File> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<File> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<File> list) {
        return baseMapper.batchInsert(list);
    }
}
