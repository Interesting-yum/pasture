package com.example.main.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.main.model.entity.Equipment;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface EquipmentMapper extends BaseMapper<Equipment> {
    int batchInsert(@Param("list") List<Equipment> list);
}