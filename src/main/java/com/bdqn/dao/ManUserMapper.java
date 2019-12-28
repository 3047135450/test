package com.bdqn.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bdqn.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ManUserMapper extends BaseMapper<User> {
    @Select(" select * from man_user where username=#{username} and `password`=#{password} ")
    User getOneUser(@Param("username") String username,@Param("password") String password);

}
