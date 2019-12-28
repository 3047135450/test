package com.bdqn.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bdqn.entity.ManType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ManTypeMapper extends BaseMapper<ManType> {
}
