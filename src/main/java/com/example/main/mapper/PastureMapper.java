package com.example.main.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.main.model.entity.Pasture;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PastureMapper extends BaseMapper<Pasture> {
    int updateBatch(List<Pasture> list);

    int updateBatchSelective(List<Pasture> list);

    int batchInsert(@Param("list") List<Pasture> list);
}