package com.entity.spring06.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @autor : WL;
 * @date : 2019/7/1 0001
 */
/*在set方法上标记，进行简单值的注入*///成员变量上也可以
    @Component
public class UserBean {
    @Value("20")
    private Integer age;
    private String name;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
@Value("lisi")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
