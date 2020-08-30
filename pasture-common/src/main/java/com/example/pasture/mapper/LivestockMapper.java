package com.example.pasture.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.pasture.model.Do.Livestock;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LivestockMapper extends BaseMapper<Livestock> {
    int updateBatch(List<Livestock> list);

    int updateBatchSelective(List<Livestock> list);

    int batchInsert(@Param("list") List<Livestock> list);
}