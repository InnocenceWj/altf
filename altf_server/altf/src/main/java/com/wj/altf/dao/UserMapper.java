package com.wj.altf.dao;

import com.wj.altf.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);
}