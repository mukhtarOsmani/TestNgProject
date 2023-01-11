import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG2 {


    @Test
    public void printMessage()
    {
        System.out.println("This is a message from printMessage method ");
    }

    @Test
    public void sum()
    {
        int result = 20;
        Assert.assertEquals(20, result );
    }
}
