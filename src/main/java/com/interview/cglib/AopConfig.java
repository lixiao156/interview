package com.interview.cglib;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/6/13 23:33
 */
@Configuration
@ComponentScan("com.interview.cglib")
public class AopConfig {
    //注入配置对象的方式之一  @Componont @bean
    //使用javaConfig配置类

}
