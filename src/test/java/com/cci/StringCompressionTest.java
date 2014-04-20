package com.cci;


import org.junit.Assert;
import org.junit.Test;

public class StringCompressionTest {

    @Test
    public void testCompress() throws Exception {
        Assert.assertEquals("a2b1c5a3",StringCompression.compress("aabcccccaaa"));
        Assert.assertEquals("a2b1c5a1",StringCompression.compress("aabccccca"));
        Assert.assertEquals("abc",StringCompression.compress("abc"));
    }
}
