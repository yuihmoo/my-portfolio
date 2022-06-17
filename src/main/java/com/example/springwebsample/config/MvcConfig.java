package com.example.springwebsample.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.concurrent.TimeUnit;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").addResourceLocations("classpath:/templates/",
                "classpath:/static/").setCacheControl(CacheControl.noCache());

        registry.addResourceHandler("/css/**").addResourceLocations("templates/css")
                .setCacheControl(CacheControl.maxAge(1, TimeUnit.HOURS));

        registry.addResourceHandler("/font/**").addResourceLocations("static/font")
                .setCacheControl(CacheControl.maxAge(1, TimeUnit.HOURS));

        // Register resource handler for images
        registry.addResourceHandler("/img/**").addResourceLocations("static/img")
                .setCacheControl(CacheControl.maxAge(1, TimeUnit.HOURS));

        // Register resource handler for js
       registry.addResourceHandler("/js/**").addResourceLocations("templates/js")
                .setCacheControl(CacheControl.maxAge(1, TimeUnit.HOURS));
    }
}
