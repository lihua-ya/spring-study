package com.entity.spring03;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @autor : WL;
 * @date : 2019/6/26 0026
 */
public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext cs = new ClassPathXmlApplicationContext("spring03.xml");
        Bean ppp = cs.getBean("ppp", Bean.class);
        System.out.println(ppp);
    }
}
