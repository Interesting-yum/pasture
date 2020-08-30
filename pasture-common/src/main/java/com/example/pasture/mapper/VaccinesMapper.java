package com.example.pasture.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.pasture.model.Do.Vaccines;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface VaccinesMapper extends BaseMapper<Vaccines> {
    int updateBatch(List<Vaccines> list);

    int updateBatchSelective(List<Vaccines> list);

    int batchInsert(@Param("list") List<Vaccines> list);
}