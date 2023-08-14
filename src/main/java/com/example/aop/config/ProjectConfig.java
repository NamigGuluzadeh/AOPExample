package com.example.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.example.aop.implementation",
        "com.example.aop.services", "com.example.aop.aspects"})
@EnableAspectJAutoProxy
public class ProjectConfig {

}
