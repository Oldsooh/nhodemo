package com.thoughtworks.nho.dao;

import com.thoughtworks.nho.model.TwUser;
import org.apache.ibatis.annotations.Param;

public interface TwUserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(TwUser record);

    int insertSelective(TwUser record);

    TwUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TwUser record);

    int updateByPrimaryKey(TwUser record);

    Integer checkIdentity(@Param("username")String username   , @Param("password")String password);


    TwUser selectUserByUsername(@Param("username")String username);
}