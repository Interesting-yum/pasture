package com.example.main.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.main.model.entity.Relation;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RelationMapper extends BaseMapper<Relation> {
    int updateBatch(List<Relation> list);

    int updateBatchSelective(List<Relation> list);

    int batchInsert(@Param("list") List<Relation> list);
}