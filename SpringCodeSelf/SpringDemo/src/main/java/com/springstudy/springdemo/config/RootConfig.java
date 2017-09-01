package com.springstudy.springdemo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by zhenchai on 2017/9/1.
 * Description: ContextLoaderListener所要加载的上下文
 *
 * @author zhenchai
 * @email zhenchai@foxmail.com
 */
@Configuration
@ComponentScan(basePackages={"com"},
        excludeFilters={
                @ComponentScan.Filter(type= FilterType.ANNOTATION, value=EnableWebMvc.class)
        })
public class RootConfig {
}
