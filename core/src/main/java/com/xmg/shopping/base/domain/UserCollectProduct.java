package com.xmg.shopping.base.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class UserCollectProduct {
    private Long id;

    private Date creatTime;

    private Long userId;

    private Long productId;
}