package com.example.main.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.main.model.entity.Video;
import com.example.main.mapper.VideoMapper;
import com.example.main.service.intf.VideoService;
@Service
public class VideoServiceImpl extends ServiceImpl<VideoMapper, Video> implements VideoService{

    @Override
    public int updateBatch(List<Video> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<Video> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<Video> list) {
        return baseMapper.batchInsert(list);
    }
}
