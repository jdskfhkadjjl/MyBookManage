package com.bookmanage.bookmanagesystem.springsecurity.mapper;

import com.bookmanage.bookmanagesystem.springsecurity.pojo.userDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface userMapper {
    @Select("select userName,userPassword from user where userName=#{username}")
    List<userDTO> Login(String username);
}
