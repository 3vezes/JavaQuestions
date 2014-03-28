package com.ic;

import org.junit.Assert;
import org.junit.Test;

public class ParenthesesTest {

    private final static String TEST_STRING = "Sometimes (when I nest them (my parentheticals) too much (like this (and this))) they get confusing.";

    @Test
    public void testFindClosing() throws Exception {
        Assert.assertEquals(79,Parentheses.findClosing(TEST_STRING,10));

    }
}
