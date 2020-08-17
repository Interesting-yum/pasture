package com.example.main.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.main.model.entity.Livestock;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LivestockMapper extends BaseMapper<Livestock> {
    int updateBatch(List<Livestock> list);

    int updateBatchSelective(List<Livestock> list);

    int batchInsert(@Param("list") List<Livestock> list);
}