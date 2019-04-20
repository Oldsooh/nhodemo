package com.thoughtworks.nho.dao;

import com.thoughtworks.nho.model.TwUser;

public interface TwUserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(TwUser record);

    int insertSelective(TwUser record);

    TwUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TwUser record);

    int updateByPrimaryKey(TwUser record);
}