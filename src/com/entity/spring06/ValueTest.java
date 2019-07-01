package com.entity.spring06;

import com.entity.spring06.entity.UserBean;
import com.entity.spring06.entity.ValueBean;
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
@ContextConfiguration(locations = "classpath:spring06.xml")
public class ValueTest {

    @Autowired
    private ValueBean valueBean;

    @Autowired
    private UserBean userBean;

    @Test
    public void test01(){
        System.out.println(valueBean);
    }

    @Test
    public void test02(){
        System.out.println(userBean);
    }


}
