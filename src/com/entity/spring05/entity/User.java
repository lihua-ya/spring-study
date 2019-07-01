package com.entity.spring05.entity;

import org.springframework.stereotype.Component;

/**
 * @autor : WL;
 * @date : 2019/7/1 0001
 */
@Component("beanUser")
public class User {
    @Override
    public String toString() {
        return "我是User";
    }
}
