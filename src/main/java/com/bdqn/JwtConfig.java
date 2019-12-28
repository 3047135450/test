package com.bdqn;

import com.bdqn.interceptor.JwtInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class JwtConfig extends WebMvcConfigurationSupport {

    @Autowired
    private JwtInterceptor jwtInterceptor;

    @Override //添加自定义拦截器到springboot拦截器池中
    protected  void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(jwtInterceptor)
                .addPathPatterns("/**") //JWT拦截规则: 拦截所有
                .excludePathPatterns("/login"); //刨除哪些接口不进行拦截
        super.addInterceptors(registry);
    }

}
