package com.xmg.shopping.base.controller;

import com.xmg.shopping.base.query.PageResult;
import com.xmg.shopping.base.query.UserQueryObject;
import com.xmg.shopping.base.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 用户相关
 */
@Controller
public class UserController {
    @Autowired
    private IUserService userService;

    /**
     * 跳转到用户列表页面
     */
    @RequestMapping("user")
    private String userIndex() {
        return "user";
    }

    /**
     * 用户列表详情
     */
    @RequestMapping("user_list")
    public String investList(UserQueryObject qo, Model model) {
        PageResult query = this.userService.query(qo);
        System.out.println("query = " + query.getResult());
        model.addAttribute("pageResult", this.userService.query(qo));
        System.out.println("qo" + qo.getUsername() == null?"null":"不为null");
        System.out.println("qo" + qo.getUsername());
        System.out.println("qo" + qo.getUsername());
        return "user_list";
    }
}
