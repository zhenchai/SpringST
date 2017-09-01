package com.springstudy.springdemo.config;

import com.springstudy.spingdemo.web.WebConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by zhenchai on 2017/9/1.
 * Description: springweb的初始化逻辑；
 * 当dispatcherServlet加载应用上下文时，会创建Spring应用上下文，并加载配置文件或配置类中所申明的bean；
 * 一种上下文是调用{@linkplain #getServletConfigClasses()}，要求DispatcherServlet加载应用上下文；
 * 另一个上下文是通过{@linkplain #getRootConfigClasses()}，要求ContextLoaderListener加载其上下文；
 * @author zhenchai
 * @email zhenchai@foxmail.com
 */
public class SpringDemoWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

    /**
     * 指定ContextLoaderListener所要加载的应用上下文
     * @return
     */
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] {
                RootConfig.class};
    }

    /**
     * 指定配置类
     * @return
     */
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] {
            WebConfig.class};
    }

    /**
     * 请求的路径映射到“/”
     * @return
     */
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
