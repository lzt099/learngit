package com.xmg.shopping.base.service;

import com.xmg.shopping.base.query.PageResult;
import com.xmg.shopping.base.query.UserQueryObject;

/**
 * Created by siye on 2016/10/26.
 */
public interface IUserService {
    /**
     * 分页查询
     *
     * @param qo
     * @return
     */
    PageResult query(UserQueryObject qo);
}
