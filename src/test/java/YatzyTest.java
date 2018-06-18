import org.junit.Assert;
import org.junit.Test;

public class YatzyTest {

    @Test
    public void yatzyTestCase001(){
        Assert.assertEquals(14,Yatzy.getYatzyResult(1,1,3,3,6));
    }
    @Test
    public void yatzyTestCase002(){
        Assert.assertEquals(21,Yatzy.getYatzyResult(4,5,5,6,1));
    }
}
