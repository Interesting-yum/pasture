package com.example.main.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.main.mapper.FileMapper;
import com.example.main.model.entity.File;
import com.example.main.service.intf.FileService;
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
