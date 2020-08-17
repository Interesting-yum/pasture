package com.example.pasture.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.pasture.model.entity.Data;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DataMapper extends BaseMapper<Data> {
    int updateBatch(List<Data> list);

    int updateBatchSelective(List<Data> list);

    int batchInsert(@Param("list") List<Data> list);
}