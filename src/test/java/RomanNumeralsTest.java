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
    @Test
    public void romanNummeralsTestCase003(){
        Assert.assertEquals("XLVII",romanNumerals.romanNumeralRepresentation(47));
    }
    @Test
    public void romanNummeralsTestCase004(){
        Assert.assertEquals("XCIX",romanNumerals.romanNumeralRepresentation(99));
    }
    @Test
    public void romanNummeralsTestCase005(){
        Assert.assertEquals("MCMXC",romanNumerals.romanNumeralRepresentation(1990));
    }
    @Test
    public void romanNummeralsTestCase006(){
        Assert.assertEquals("MMVIII",romanNumerals.romanNumeralRepresentation(2008));
    }
}
