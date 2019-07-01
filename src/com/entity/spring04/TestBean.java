package com.entity.spring04;

import org.springframework.stereotype.Component;

/**
 * @autor : WL;
 * @date : 2019/7/1 0001
 */
//要想让Spring自动管理我，我需要与众不同
@Component("beanNam")
public class TestBean {
    @Override
    public String toString() {
        return "我是TestBean";
    }
}
