package com.cci;

import org.junit.Assert;
import org.junit.Test;

public class FirstNonRepeatingTest {

    @Test
    public void testFirstNonRepeating() throws Exception {
        Assert.assertEquals("o", FirstNonRepeating.find("total"));
        Assert.assertEquals("r", FirstNonRepeating.find("teeter"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAllRepeating() throws Exception {
        FirstNonRepeating.find("aabbcc");
    }
}
