package com.yst.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @creator: ly-yangst
 * @date: 2022/7/4
 */
@Controller//2.1定义为一个bean
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/save")//2.2访问路径
    @ResponseBody//2.3返回值类型
    public String save(String name) {
        System.out.println("user save ..." + name);
//        return " 'module' : 'springmvc' ";
        return "save" + name;
    }


}
