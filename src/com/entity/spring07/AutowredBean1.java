package com.entity.spring07;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @autor : WL;
 * @date : 2019/7/1 0001
 */
@Component
public class AutowredBean1 {
    @Override
    public String toString() {
        return "AutowredBean1...在容器中";
    }

    @PostConstruct
    public void Construct(){
        System.out.println("开始");
    }

    @PreDestroy
    public void Destroy(){
        System.out.println("删除");
    }
}
