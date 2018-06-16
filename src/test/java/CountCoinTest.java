import org.junit.Assert;
import org.junit.Test;

public class CountCoinTest {

    @Test
    public void countCoinTestCase001(){
        Assert.assertEquals("15 pennies" ,CountCoin.getCountCoin(15));
    }


}
