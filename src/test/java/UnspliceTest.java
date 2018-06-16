import org.junit.Assert;
import org.junit.Test;

public class UnspliceTest {

    @Test
    public void testUnspliceCase001(){
        Assert.assertEquals("abcdef",  Unsplice.unspliceMethod("abcdef"));
    }

    @Test
    public void testUnspliceCase002(){
        Assert.assertEquals("abc\ndef",  Unsplice.unspliceMethod("abc\ndef"));
    }
}
