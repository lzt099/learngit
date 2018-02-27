package com.xmg.shopping.base.mapper;

import com.xmg.shopping.base.domain.UserCollectProduct;
import com.xmg.shopping.base.query.UserCollectProductQueryObject;

import java.util.List;

public interface UserCollectProductMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserCollectProduct record);

    UserCollectProduct selectByPrimaryKey(Long id);

    List<UserCollectProduct> selectAll();

    int updateByPrimaryKey(UserCollectProduct record);

    int queryForCount(UserCollectProductQueryObject qo);

    List<UserCollectProduct> query(UserCollectProductQueryObject qo);
}