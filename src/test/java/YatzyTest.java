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
    @Test
    public void yatzyTestCase003(){
        Assert.assertEquals(50,Yatzy.getYatzyResult("Yatzy", new int[]{1,1,1,1,1}));
    }
    @Test
    public void yatzyTestCase004(){
        Assert.assertEquals(50,Yatzy.getYatzyResult("Yatzy", new int[]{5,5,5,5,5}));
    }
    @Test
    public void yatzyTestCase005(){
        Assert.assertEquals(0,Yatzy.getYatzyResult("Yatzy", new int[]{1,1,1,2,1}));
    }
    @Test
    public void yatzyTestCase006(){
        Assert.assertEquals(8,Yatzy.getYatzyResult("Doubles", new int[]{1,1,2,4,4}));
    }
}
