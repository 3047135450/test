package com.bdqn.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bdqn.entity.Contact;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ContactMapper extends BaseMapper<Contact> {
    @Select(" select c.*,t.type man_type from contact c,mantype t where c.man_type_id=t.id limit #{page},#{size} ")
    List<Contact> getListByContact(@Param("page") int page,@Param("size") int size);


    @Select(" select count(1) from contact ")
    int getCount();


}
