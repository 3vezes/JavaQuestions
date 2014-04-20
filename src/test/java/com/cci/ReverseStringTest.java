package com.cci;

import org.junit.Assert;
import org.junit.Test;

public class ReverseStringTest {

    private static final String TEST_1 = "The quick brown fox jumps over the lazy dog";
    private static final String TEST_2 = "odd";

    @Test
    public void testReverse() throws Exception {
        Assert.assertEquals(reverse(TEST_1), ReverseString.reverse(TEST_1));
        Assert.assertEquals(reverse(TEST_2), ReverseString.reverse(TEST_2));
    }

    private String reverse(String original){
        return new StringBuilder(original).reverse().toString();
    }
}
