package com.xmg.shopping.base.query;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by siye on 2016/10/26.
 */
@Getter
@Setter
public class UserQueryObject extends QueryObject {
    private String username;

    public String getUsername() {
        return "".equals(this.username.trim()) ? null : username;
    }


}
