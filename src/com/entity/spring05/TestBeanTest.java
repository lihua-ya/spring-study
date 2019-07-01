package com.entity.spring05;

import com.entity.spring05.entity.TestBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @autor : WL;
 * @date : 2019/7/1 0001
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring05.xml")
public class TestBeanTest {
    @Autowired//自动注入spring容器中的bean
    private TestBean testBean;

    //获取容器对象
    @Autowired
    private ApplicationContext applicationContext;

    //指定bean的生命周期的方法
    @Test
    public void test1(){
        System.out.println(testBean);
    }



    @Test
    public void testBeanName(){
        //通过容器对象查看是否有testBeanName这个id
        System.out.println(applicationContext.containsBean("testBeanName"));
        System.out.println("======================");
        //通过容器对象获取所有id并遍历
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String name:beanDefinitionNames) {
            System.out.println(name);
        }
    }

}
