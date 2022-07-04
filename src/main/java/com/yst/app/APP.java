package com.yst.app;

import com.yst.app.conf.SpringConfig;
import com.yst.app.controller.UserController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @creator: ly-yangst
 * @date: 2022/7/4
 */
public class APP {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        System.out.println(ctx.getBean(UserController.class));
    }
}
