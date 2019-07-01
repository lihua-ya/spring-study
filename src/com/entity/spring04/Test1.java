package com.entity.spring04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @autor : WL;
 * @date : 2019/7/1 0001
 */
public class Test1 {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring4.xml");
        //尝试获取TestBean，看看Spring是否已经放进去
        TestBean bean = ac.getBean(TestBean.class);
        System.out.println(bean);

        //只标注注解，默认注册到容器中的bean的id、name是：类名首字母小写。比如：TestBean，在容器中的id是 testBean
        String[] beanDefinitionNames=ac.getBeanDefinitionNames();
        for (String name:beanDefinitionNames) {
            System.out.println(name);
        }
    }
}
