import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NumberNamesTest {
    NumberNames numberNames;
    @Before
    public void setUp(){
         numberNames = new NumberNames();
    }

    @Test
    public void numberNamesTestCase001() {
        Assert.assertEquals("ninety nine",numberNames.getNumberNames(99));
    }
    @Test
    public void numberNamesTestCase002() {
        Assert.assertEquals("three hundred",numberNames.getNumberNames(300));
    }
    @Test
    public void numberNamesTestCase003() {
        Assert.assertEquals("three hundred and ten",numberNames.getNumberNames(310));
    }
}
