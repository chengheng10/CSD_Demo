import YatzyGroup.Yatzy;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class YatzyTest {
    Yatzy yatzy;
    @Before
    public void setUp(){
        yatzy = new Yatzy();
    }

    @Test
    public void yatzyTestCase001(){
        Assert.assertEquals(14,yatzy.getYatzyResult("Chance", new int[]{1, 1, 3, 3, 6}));
    }
    @Test
    public void yatzyTestCase002(){
        Assert.assertEquals(21,yatzy.getYatzyResult("Chance", new int[]{4,5,5,6,1}));
    }
    @Test
    public void yatzyTestCase003(){
        Assert.assertEquals(50,yatzy.getYatzyResult("Yatzy", new int[]{1,1,1,1,1}));
    }
    @Test
    public void yatzyTestCase004(){
        Assert.assertEquals(50,yatzy.getYatzyResult("Yatzy", new int[]{5,5,5,5,5}));
    }
    @Test
    public void yatzyTestCase005(){
        Assert.assertEquals(0,yatzy.getYatzyResult("Yatzy", new int[]{1,1,1,2,1}));
    }
    @Test
    public void yatzyTestCase006(){
        Assert.assertEquals(8,yatzy.getYatzyResult("Doubles", new int[]{1,1,2,4,4}));
    }
    @Test
    public void yatzyTestCase007(){
        Assert.assertEquals(4,yatzy.getYatzyResult("Doubles", new int[]{2,3,2,5,1}));
    }
    @Test
    public void yatzyTestCase008(){
        Assert.assertEquals(0,yatzy.getYatzyResult("Doubles", new int[]{3,3,3,4,5}));
    }
}
