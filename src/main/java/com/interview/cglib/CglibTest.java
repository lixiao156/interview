package com.interview.cglib;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.domain.jaxb.SpringDataJaxb;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/6/13 23:34
 */
public class CglibTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(AopConfig.class);
        System.out.println(annotationConfigApplicationContext.getBean(OrderDao.class));
        //获取的不是AopConfig的类对象，是经过代理后
        AopConfig bean = annotationConfigApplicationContext.getBean(AopConfig.class);
        System.out.println(bean);
    }
}
