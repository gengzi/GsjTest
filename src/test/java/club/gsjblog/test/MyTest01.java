package club.gsjblog.test;

import org.junit.*;

/**
 * 测试类
 */
public class MyTest01 {

    private Claculate claculate;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("静态提前执行");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("静态结束执行");
    }

    @Before
    public void before(){
        System.out.println("创建对象");
        claculate = new Claculate();
    }

    @Test
    public void fun01(){
        int add = claculate.add(1, 1);
        System.out.println(add);
    }

    @After
    public void after(){
        System.out.println("测试结束");
    }
}
