package com.mall.web.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by Administrator on 2018/10/7 0007.
 */
@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.mall.web.controller")
public class WebMvcConfig implements WebMvcConfigurer {



}
