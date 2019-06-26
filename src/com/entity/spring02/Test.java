package com.entity.spring02;

import com.entity.spring01.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @autor : WL;
 * @date : 2019/6/26 0026
 */
public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext cs = new ClassPathXmlApplicationContext();
        cs.setConfigLocation("spring02.xml");
        cs.refresh();
        Bean bean = (Bean)cs.getBean("bean1");
        System.out.println(bean);
        System.out.println(bean.getData2());
    }
}
