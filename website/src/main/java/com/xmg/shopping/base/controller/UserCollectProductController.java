package com.xmg.shopping.base.controller;

import com.xmg.shopping.base.query.UserCollectProductQueryObject;
import com.xmg.shopping.base.service.IUserCollectProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 用户收藏夹
 */
@Controller
public class UserCollectProductController {
    @Autowired
    private IUserCollectProductService userCollectProductService;

    /**
     * 跳转到用户收藏列表页面
     */
    @RequestMapping("userCollectProduct")
    private String userCollectProductIndex() {
        return "userCollectProduct";
    }

    /**
     * 用户列表详情
     */
    @RequestMapping("userCollectProduct_list")
    public String investList(UserCollectProductQueryObject qo, Model model) {
        //获取当前系统中的用户id;设置给qo;
        model.addAttribute("pageResult", this.userCollectProductService.query(qo));
        return "userCollectProduct_list";
    }
}
