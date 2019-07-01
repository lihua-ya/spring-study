package com.entity.spring05.entity;

import org.springframework.stereotype.Component;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @autor : WL;
 * @date : 2019/7/1 0001
 */
@Component("testBeanName")
public class TestBean {
    @Override
    public String toString() {
        return "我是TestBean";
    }
//@PostConstruct和@PreDestroy是java标准的注解
    @PostConstruct
    public void init(){
        System.out.println("bean init......");
    }
    @PreDestroy
    public void destory(){
        System.out.println("bean destory.......");
    }
}
