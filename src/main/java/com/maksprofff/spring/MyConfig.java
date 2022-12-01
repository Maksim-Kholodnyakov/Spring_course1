package com.maksprofff.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.maksprofff.spring")
public class MyConfig {
    AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext();
}
