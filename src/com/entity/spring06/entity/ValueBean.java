package com.entity.spring06.entity;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * @autor : WL;
 * @date : 2019/7/1 0001
 */
@Component()
public class ValueBean {
    private Integer age;
    private String name;
//在构造方法的参数上使用，简单值注入
    public ValueBean(@Value("18") Integer age,@Value("zhangsan") String name) {
        this.age = age;
        this.name = name;
    }



    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ValueBean{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
