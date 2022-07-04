package com.yst.app.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @creator: ly-yangst
 * @date: 2022/7/4
 */
@Configuration//3.创建springmvc配置文件,加载controller类型的bean
@ComponentScan("com.yst.app.controller")//3.1扫描controller
public class springMvcConfig {

}