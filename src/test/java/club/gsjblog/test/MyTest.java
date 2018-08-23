package club.gsjblog.test;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * 测试类
 */
public class MyTest {

    @Test
    public void fun01(){
        Claculate claculate = new Claculate();
        int add = claculate.add(1, 1);
        System.out.println(add);
    }


    /**
     * 断言测试
     */
    @Test
    public void testAdd(){
        Claculate claculate = new Claculate();
//        assertEquals(claculate.add(1,1),2);
//        assertNotEquals(claculate.add(1,1),2);


//        Assert.assertEquals(claculate.add(1,1),2);
//        Assert.assertNotEquals(claculate.add(1,1),2);

    }


    /**
     * 异常预测测试
     */
    @Test(expected = AssertionError.class)
    public void testAddByException(){
        Claculate claculate = new Claculate();
        assertEquals(claculate.add(1,1),2);
        assertNotEquals(claculate.add(1,1),2);

    }

    /**
     * timeout 超时关闭  @Test(timeout=毫秒)
     */
    @Test(timeout = 3000)
    public void testAddByTimeOut(){
        Claculate claculate = new Claculate();
        int add = claculate.add(1, 1);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    /**
     * 忽略测试 ，在测试整个类时
     */
    @Ignore
    @Test
    public void ignore(){
        Claculate claculate = new Claculate();
        int add = claculate.add(1, 1);
        System.out.println("打印忽略测试："+add);
    }



    /**
     * 断言测试-相同
     * @param sum
     * @param num
     */
    public void assertEquals(int sum ,int num){
        assert sum == num:"相同";
    }

    /**
     * 断言测试-不相同
     * @param sum
     * @param num
     */
    public void assertNotEquals(int sum ,int num){
        assert sum != num:"不相同";
    }


}
