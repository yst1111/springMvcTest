package com.yst.app.conf;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @creator: ly-yangst
 * @date: 2022/7/4
 */
@Configuration//3.创建springmvc配置文件,加载controller类型的bean
@ComponentScan("com.yst.app.controller")//3.1扫描controller
@EnableWebMvc
@Slf4j
public class springMvcConfig {
}
