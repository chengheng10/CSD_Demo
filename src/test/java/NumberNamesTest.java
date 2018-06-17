import org.junit.Assert;
import org.junit.Test;

public class NumberNamesTest {
    @Test
    public void numberNamesTestCase001() {
        Assert.assertEquals("ninety nine",NumberNames.getNumberNames(99));
    }


}
