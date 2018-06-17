import org.junit.Assert;
import org.junit.Test;

public class RomanNumeralsTest {
    @Test
    public void romanNummeralsTestCase001(){
        Assert.assertEquals("I",RomanNumerals.romanNumeralRepresentation(1));
    }
}
