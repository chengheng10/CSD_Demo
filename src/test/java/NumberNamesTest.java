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
    @Test
    public void numberNamesTestCase004() {
        Assert.assertEquals("one thousand, five hundred and one",numberNames.getNumberNames(1501));
    }
    @Test
    public void numberNamesTestCase005() {
        Assert.assertEquals("twelve thousand, six hundred and nine",numberNames.getNumberNames(12609));
    }
    @Test
    public void numberNamesTestCase006() {
        Assert.assertEquals("five hundred and twelve thousand, six hundred and seven",numberNames.getNumberNames(512607));
    }
}
