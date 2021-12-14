package com.meteorxsh.wiki.config;

import com.meteorxsh.wiki.interceptor.LogInterceptor;
import javax.annotation.Resource;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author shMeteor
 * @create 2021-12-14-23:38
 */
public class SpringMvcConfig implements WebMvcConfigurer {

  @Resource
  LogInterceptor logInterceptor;

  public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(logInterceptor)
        .addPathPatterns("/**").excludePathPatterns("/login");
  }
}
