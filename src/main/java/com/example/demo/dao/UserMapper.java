/*
*
* UserMapper.java
* Copyright(C) 2018-2099 LiuNH
* @date 2018-11-29
*/
package com.example.demo.dao;

import com.example.demo.model.tables.User;

public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}