import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestNgClass {

    @Test(priority = 1)
    public void test2()
    {
        System.out.println("This message is from Test 2");
    }

    @Test(priority = 2)
    public void test1()
    {
        System.out.println("This message is from Test 1");
//        Assert.fail();
    }

    @Test(priority = 3)
    public void test3()
    {
        System.out.println("This message is from Test 3");
    }
}
