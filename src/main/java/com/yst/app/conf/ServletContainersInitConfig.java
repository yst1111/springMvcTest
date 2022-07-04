package com.yst.app.conf;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

/**
 * @creator: ly-yangst
 * @date: 2022/7/4
 */
//4.定义一个servlet容器启动的配置类,在该配置类中加载 spring的配置
public class ServletContainersInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{springMvcConfig.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

//    //加载springMvc容器配置
//    protected WebApplicationContext createServletApplicationContext() {
//        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
//        ctx.register(springMvcConfig.class);
//        return ctx;
//    }
//
//    //设置拦截路径,"/"表示全部拦截
//    protected String[] getServletMappings() {
//        return new String[]{"/"};
//    }
//
//    //加载spring相关容器配置
//    protected WebApplicationContext createRootApplicationContext() {
//        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
//        ctx.register(SpringConfig.class);
//        return ctx;
//    }

}
