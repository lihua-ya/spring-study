package com.entity.spring01;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @autor : WL;
 * @date : 2019/6/26 0026
 */
public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext cs = new ClassPathXmlApplicationContext("spring01.xml");
        Bean bean = cs.getBean("bean",Bean.class);
        System.out.println("List集合"+bean.getData());
        Bean bean1 = cs.getBean("bean1", Bean.class);
        System.out.println("map集合"+bean1.getAddress());
        Bean bean2 = cs.getBean("bean2", Bean.class);
        System.out.println("set集合"+bean2.getLove());
        Person person1 = cs.getBean("person1", Person.class);
        System.out.println(person1);
        Person person2 = cs.getBean("person2", Person.class);
        System.out.println(person2);
        Person person3 = cs.getBean("person3", Person.class);
        System.out.println(person3.getProperties());
    }
}
