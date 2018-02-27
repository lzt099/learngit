package com.xmg.shopping.base.service.impl;

import com.xmg.shopping.base.domain.User;
import com.xmg.shopping.base.mapper.UserMapper;
import com.xmg.shopping.base.query.PageResult;
import com.xmg.shopping.base.query.UserQueryObject;
import com.xmg.shopping.base.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by siye on 2016/10/26.
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public PageResult query(UserQueryObject qo) {
        int count = this.userMapper.queryForCount(qo);
        if (count > 0) {
            List<User> list = this.userMapper.query(qo);
            return new PageResult(count, list, qo.getCurrentPage(),
                    qo.getPageSize());
        }
        return PageResult.empty(qo.getPageSize());
    }
}
