package com.xmg.shopping.base.service;

import com.xmg.shopping.base.query.PageResult;
import com.xmg.shopping.base.query.UserCollectProductQueryObject;

/**
 * Created by siye on 2016/10/26.
 */
public interface IUserCollectProductService {
    /**
     * 分页查询
     *
     * @param qo
     * @return
     */
    PageResult query(UserCollectProductQueryObject qo);
}
