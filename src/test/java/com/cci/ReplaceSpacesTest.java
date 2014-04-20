package com.cci;

import org.junit.Assert;
import org.junit.Test;

public class ReplaceSpacesTest {

    @Test
    public void testReplace() throws Exception {
        Assert.assertEquals("Mr%20John%20Smith",ReplaceSpaces.replace("Mr John Smith"));
    }
}
