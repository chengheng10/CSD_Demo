import org.junit.Assert;
import org.junit.Test;

public class YatzyTest {

    @Test
    public void yatzyTestCase001(){
        Assert.assertEquals(14,Yatzy.getYatzyResult(1,1,3,3,6));
    }

}
