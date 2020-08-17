package com.example.main.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.main.model.entity.Data;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DataMapper extends BaseMapper<Data> {
}