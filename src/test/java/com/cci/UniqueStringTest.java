package com.cci;

import com.google.common.base.Strings;
import org.junit.Assert;
import org.junit.Test;

public class UniqueStringTest {

    @Test
    public void testIsUnique() throws Exception {
        Assert.assertTrue(UniqueString.isUnique("abcdefg"));
        Assert.assertFalse(UniqueString.isUnique(Strings.repeat("a",10)));
        Assert.assertTrue(UniqueString.isUnique(""));
    }
}
