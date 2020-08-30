package com.example.pasture.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.pasture.model.Do.File;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface FileMapper extends BaseMapper<File> {
    int updateBatch(List<File> list);

    int updateBatchSelective(List<File> list);

    int batchInsert(@Param("list") List<File> list);
}