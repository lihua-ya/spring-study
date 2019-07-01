package com.entity.spring04;

import org.junit.*;

/**
 * @autor : WL;
 * @date : 2019/7/1 0001
 */
public class TestBeanTest {
    @BeforeClass //整个测试类加载时，执行一次此方法
    public static void setUpBeforeClass() throws Exception {
        System.out.println("setUpBeforeClass");
    }

    @AfterClass //整个测试类卸载时，执行一次此方法
    public static void tearDownAfterClass() throws Exception {
        System.out.println("tearDownAfterClass");
    }

    @Before //每个@Test测试执行开始前，都会执行一次此方法
    public void setUp() throws Exception {
        System.out.println("setUp");
    }

    @After //每个@Test测试执行完成后，都会执行一次此方法
    public void tearDown() throws Exception {
        System.out.println("tearDown");
    }

    @Test  //要想对某个方法进行测试，该方法上就必须标记@Test
    public void test() {
        //fail("Not yet implemented");

//		Integer aa =null;//
//		assertNotNull(aa);
        System.out.println("test");
//		int a =1/0;
    }

    @Test
    public void test2() {
//		fail("Not yet implemented");
        System.out.println("test2");

    }
}
