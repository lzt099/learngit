package com.xmg.shopping.base.service.impl;

import com.xmg.shopping.base.domain.UserCollectProduct;
import com.xmg.shopping.base.mapper.UserCollectProductMapper;
import com.xmg.shopping.base.query.PageResult;
import com.xmg.shopping.base.query.UserCollectProductQueryObject;
import com.xmg.shopping.base.service.IUserCollectProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserCollectProductServiceImpl implements IUserCollectProductService {
    @Autowired
    private UserCollectProductMapper userCollectProductMapper;

    @Override
    public PageResult query(UserCollectProductQueryObject qo) {
        int count = this.userCollectProductMapper.queryForCount(qo);
        if (count > 0) {
            List<UserCollectProduct> list = this.userCollectProductMapper.query(qo);
            return new PageResult(count, list, qo.getCurrentPage(),
                    qo.getPageSize());
        }
        return PageResult.empty(qo.getPageSize());
    }
}