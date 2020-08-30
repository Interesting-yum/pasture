package com.example.pasture.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.pasture.model.Do.Video;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface VideoMapper extends BaseMapper<Video> {
    int updateBatch(List<Video> list);

    int updateBatchSelective(List<Video> list);

    int batchInsert(@Param("list") List<Video> list);
}