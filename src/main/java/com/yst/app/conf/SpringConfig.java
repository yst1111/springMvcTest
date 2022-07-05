package com.yst.app.conf;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

/**
 * @creator: ly-yangst
 * @date: 2022/7/4
 */
@Configuration
@ComponentScan(
        value = "com.yst.app",
        excludeFilters = @ComponentScan.Filter(
                type = FilterType.ANNOTATION,
                classes = Controller.class
        )
)
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class,MybatisConfig.class}) //整合jdbc和mybatis,将两个配置类注册成bean
public class SpringConfig {

}
