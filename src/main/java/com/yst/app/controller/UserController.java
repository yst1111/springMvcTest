package com.yst.app.controller;

import com.yst.app.domain.Student;
import com.yst.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @creator: ly-yangst
 * @date: 2022/7/4
 */
@Controller//2.1定义为一个bean
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/save")//2.2访问路径
    @ResponseBody//2.3返回值类型
    public String save(String name) {
        System.out.println("user save ..." + name);
        return " 'module' : 'springmvc' ";
//        return "save" + name;
    }

    @RequestMapping("/reparam")
    public String reParam(@RequestParam("name") String username, int age) {
        System.out.println("name --> userName " + username);
        System.out.println("age --> " + age);

        return " 'module' : 'springmvc' ";
    }

    @RequestMapping("/list")
    @ResponseBody
    public String listTest(@RequestBody List<String> list) {
        System.out.println("list -- > " + list);
        return "{'module':'list param'}";

    }

    @RequestMapping("/selectStudentById")
    @ResponseBody
    public Student selectStudentById(@RequestParam String id) {
        System.out.println("selectStudentById -- > " + id);
        return userService.selectStudentById(id);

    }


}
