package com.games.admin.mapper.gamesAdmin;

import com.games.admin.model.GameTypeStat;

public interface GameTypeStatMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GameTypeStat record);

    int insertSelective(GameTypeStat record);

    GameTypeStat selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GameTypeStat record);

    int updateByPrimaryKey(GameTypeStat record);
}