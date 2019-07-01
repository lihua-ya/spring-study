package com.entity.spring07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @autor : WL;
 * @date : 2019/7/1 0001
 */
/*//支持在方法上
	@Autowired
	public AutowiredBean2(AutowiredBean1 autowiredBean1) {
		this.autowiredBean1 = autowiredBean1;
	}

	//只能是在构造方法的参数上，并且还需要要求没有无参的构造方法才起作用。
	public AutowiredBean2(@Autowired AutowiredBean1 autowiredBean1) {
		this.autowiredBean1 = autowiredBean1;
	}
	//如果一个类只有一个带参数的构造方法，那么，即使什么注解都不写，Spring也会将容器中的内容自动注入过来
	public AutowiredBean2(AutowiredBean1 autowiredBean1) {
		this.autowiredBean1 = autowiredBean1;
	}

	//注释在成员变量的位置：还可以没有getset方法也ok
	@Autowired
	private AutowiredBean1 autowiredBean1;*/
@Component
public class AutowredBean2 {
    //让AutowredBean2依赖AutowredBean1【在spring容器中】

    private AutowredBean1 autowredBean1;

    public AutowredBean1 getAutowredBean1() {
        return autowredBean1;
    }

    public void setAutowredBean1(AutowredBean1 autowredBean1) {
        this.autowredBean1 = autowredBean1;
    }

    public AutowredBean2() {
    }

//    @Override
//    public String toString() {
//        return "AutowredBean2{" +
//                "autowredBean1=" + autowredBean1 +
//                '}';
//    }

    @Autowired
    public AutowredBean2(AutowredBean1 autowredBean1) {
        this.autowredBean1 = autowredBean1;
    }
}
