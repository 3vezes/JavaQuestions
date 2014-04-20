package com.cci;


import com.google.common.base.Strings;
import org.junit.Assert;
import org.junit.Test;

public class StringPermutationTest {

    @Test
    public void testIsPermutation() throws Exception {
        String repeatingString = Strings.repeat("a", 10);
        Assert.assertTrue(StringPermutation.isPermutation(repeatingString, repeatingString));
        Assert.assertFalse(StringPermutation.isPermutation("abc", "def"));
        Assert.assertTrue(StringPermutation.isPermutation("abc", "cba"));
    }
}
