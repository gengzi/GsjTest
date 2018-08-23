package club.gsjblog.test;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * 测试套件,就是将写好的测试类一并执行。
 *
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({MyTest01.class,MyTest.class})
public class TestSuite {
}
