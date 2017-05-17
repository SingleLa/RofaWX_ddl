package com.game.WX.mapper;

import com.game.WX.model.Account;

public interface AccountMapper {
    int deleteByPrimaryKey(Integer agencyid);

    int insert(Account record);

    int insertSelective(Account record);

    Account selectByPrimaryKey(Integer agencyid);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);
}