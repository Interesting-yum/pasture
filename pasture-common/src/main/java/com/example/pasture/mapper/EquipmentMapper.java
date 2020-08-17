package com.example.pasture.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.pasture.model.entity.Equipment;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface EquipmentMapper extends BaseMapper<Equipment> {
    int updateBatch(List<Equipment> list);

    int updateBatchSelective(List<Equipment> list);

    int batchInsert(@Param("list") List<Equipment> list);
}