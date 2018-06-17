import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RomanNumeralsTest {
    RomanNumerals romanNumerals;
    @Before
    public void setUp(){
        romanNumerals = new RomanNumerals();
    }
    
    @Test
    public void romanNummeralsTestCase001(){
        Assert.assertEquals("I",romanNumerals.romanNumeralRepresentation(1));
    }
    @Test
    public void romanNummeralsTestCase002(){
        Assert.assertEquals("II",romanNumerals.romanNumeralRepresentation(2));
    }
}
