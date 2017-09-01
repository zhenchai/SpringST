package com.springstudy.spingdemo.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by zhenchai on 2017/9/1.
 * Description: dispatcherServelt所要加载的上下文
 *
 * @author zhenchai
 * @email zhenchai@foxmail.com
 */
@Configuration  //带有@configuration的类才会被加载
@EnableWebMvc   //启动Spring MVC
@ComponentScan("com.springstudy.spingdemo.web")  //配置扫描组件
public class WebConfig extends WebMvcConfigurerAdapter{


    /**
     * 配置JSP视图解释器
     * @return
     */
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        resolver.setExposeContextBeansAsAttributes(true);
        return resolver;
    }

    /**
     * 配置静态资源的处理
     * @param configurer
     */
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        super.configureDefaultServletHandling(configurer);
        configurer.enable();
    }
}
