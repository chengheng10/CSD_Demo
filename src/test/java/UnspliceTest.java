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

    @Test
    public void testUnspliceCase003(){
        Assert.assertEquals("abc\\def",  Unsplice.unspliceMethod("abc\\def"));
    }

    @Test
    public void testUnspliceCase004(){
        Assert.assertEquals("abc\n\\def",  Unsplice.unspliceMethod("abc\n\\def"));
    }

    @Test
    public void testUnspliceCase005(){
        Assert.assertEquals("abcdef",  Unsplice.unspliceMethod("abc\\\ndef"));
    }
}
