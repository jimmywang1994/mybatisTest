package com.ww.mybatis.mapper;

import com.ww.mybatis.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    public User selectUser(Integer id);
}
