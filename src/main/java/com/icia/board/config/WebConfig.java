package com.icia.board.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginCheckInterceptor()) // Interceptor to register
                .order(1) // Priority of the interceptor
                .addPathPatterns("/**") // URL patterns to be intercepted (all URLs)
                .excludePathPatterns(
                        "/", "/member/save", "/member/login",
                        "/js/**", "/css/**", "/images/**",
                        "/*.ico", "/favicon/**"); // URLs to be excluded from interceptor validation
    }
}
