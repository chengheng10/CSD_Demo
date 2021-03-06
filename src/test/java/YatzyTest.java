import YatzyGroup.Yatzy;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class YatzyTest {
    Yatzy yatzy;

    @Before
    public void setUp() {
        yatzy = new Yatzy();
    }

    @Test
    public void yatzyTestCase001() {
        Assert.assertEquals(14, yatzy.getYatzyResult("Chance", new int[]{1, 1, 3, 3, 6}));
    }

    @Test
    public void yatzyTestCase002() {
        Assert.assertEquals(21, yatzy.getYatzyResult("Chance", new int[]{4, 5, 5, 6, 1}));
    }

    @Test
    public void yatzyTestCase003() {
        Assert.assertEquals(50, yatzy.getYatzyResult("Yatzy", new int[]{1, 1, 1, 1, 1}));
    }

    @Test
    public void yatzyTestCase004() {
        Assert.assertEquals(50, yatzy.getYatzyResult("Yatzy", new int[]{5, 5, 5, 5, 5}));
    }

    @Test
    public void yatzyTestCase005() {
        Assert.assertEquals(0, yatzy.getYatzyResult("Yatzy", new int[]{1, 1, 1, 2, 1}));
    }

    @Test
    public void yatzyTestCase006() {
        Assert.assertEquals(8, yatzy.getYatzyResult("Doubles", new int[]{1, 1, 2, 4, 4}));
    }

    @Test
    public void yatzyTestCase007() {
        Assert.assertEquals(4, yatzy.getYatzyResult("Doubles", new int[]{2, 3, 2, 5, 1}));
    }

    @Test
    public void yatzyTestCase008() {
        Assert.assertEquals(0, yatzy.getYatzyResult("Doubles", new int[]{3, 3, 3, 4, 5}));
    }

    @Test
    public void yatzyTestCase009() {
        Assert.assertEquals(9, yatzy.getYatzyResult("ThreeKind", new int[]{3, 3, 3, 4, 5}));
    }

    @Test
    public void yatzyTestCase010() {
        Assert.assertEquals(0, yatzy.getYatzyResult("ThreeKind", new int[]{3, 3, 4, 5, 6}));
    }

    @Test
    public void yatzyTestCase011() {
        Assert.assertEquals(0, yatzy.getYatzyResult("ThreeKind", new int[]{3, 3, 3, 3, 1}));
    }

    @Test
    public void yatzyTestCase012() {
        Assert.assertEquals(8, yatzy.getYatzyResult("FourKind", new int[]{2, 2, 2, 2, 5}));
    }

    @Test
    public void yatzyTestCase013() {
        Assert.assertEquals(0, yatzy.getYatzyResult("FourKind", new int[]{2, 2, 2, 5, 5}));
    }

    @Test
    public void yatzyTestCase014() {
        Assert.assertEquals(0, yatzy.getYatzyResult("FourKind", new int[]{2, 2, 2, 2, 2}));
    }

    @Test
    public void yatzyTestCase015() {
        Assert.assertEquals(15, yatzy.getYatzyResult("Smallstraight", new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void yatzyTestCase016() {
        Assert.assertEquals(20, yatzy.getYatzyResult("Largestraight", new int[]{2, 3, 4, 5, 6}));
    }

    @Test
    public void yatzyTestCase017() {
        Assert.assertEquals(8, yatzy.getYatzyResult("Twopairs", new int[]{1, 1, 2, 3, 3}));
    }

    @Test
    public void yatzyTestCase018() {
        Assert.assertEquals(0, yatzy.getYatzyResult("Twopairs", new int[]{1, 1, 2, 3, 4}));
    }

    @Test
    public void yatzyTestCase019() {
        Assert.assertEquals(0, yatzy.getYatzyResult("Twopairs", new int[]{1, 1, 2, 2, 2}));
    }

    @Test
    public void yatzyTestCase020() {
        Assert.assertEquals(8, yatzy.getYatzyResult("Fullhouse", new int[]{1, 1, 2, 2, 2}));
    }

    @Test
    public void yatzyTestCase021() {
        Assert.assertEquals(0, yatzy.getYatzyResult("Fullhouse", new int[]{2, 2, 3, 3, 4}));
    }

    @Test
    public void yatzyTestCase022() {
        Assert.assertEquals(0, yatzy.getYatzyResult("Fullhouse", new int[]{4, 4, 4, 4, 4}));
    }
}
