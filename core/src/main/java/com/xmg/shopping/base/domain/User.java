package com.xmg.shopping.base.domain;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by han on 2016/10/26.
 */

/**
 * 注册用户
 */
@Setter
@Getter
public class User extends BaseDomain {
    private String avatar;//头像
    private Date registrationTime;//注册时间
    private String username;//用户名
    private String phoneNumber;//手机号
    private String email;//邮箱
    private String password;//密码
    //冗余数据
    //有效订单数
    private Integer orderNumber;
    //总订单金额
    private BigDecimal totalAmount;
    //用户账户余额
    private BigDecimal useableAmount;
    //用户等级
    private String grade;
    //用户积分
    private Integer score;
}
