package com.xmg.shopping.base.mapper;

import com.xmg.shopping.base.domain.User;
import com.xmg.shopping.base.query.UserQueryObject;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    User selectByPrimaryKey(Long id);

    List<User> selectAll();

    int updateByPrimaryKey(User record);

    int queryForCount(UserQueryObject qo);

    List<User> query(UserQueryObject qo);
}