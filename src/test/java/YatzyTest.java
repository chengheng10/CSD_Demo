import org.junit.Assert;
import org.junit.Test;

public class YatzyTest {

    @Test
    public void yatzyTestCase001(){
        Assert.assertEquals(14,Yatzy.getYatzyResult("Chance", new int[]{1, 1, 3, 3, 6}));
    }
    @Test
    public void yatzyTestCase002(){
        Assert.assertEquals(21,Yatzy.getYatzyResult("Chance", new int[]{4,5,5,6,1}));
    }
}
