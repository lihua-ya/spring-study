package com.entity.spring07;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @autor : WL;
 * @date : 2019/7/1 0001
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring07.xml")
public class Testautowred {

    @Autowired
    private AutowredBean2 autowredBean2;

    @Test
    public void test01(){
        System.out.println(autowredBean2.getAutowredBean1());
    }

}
