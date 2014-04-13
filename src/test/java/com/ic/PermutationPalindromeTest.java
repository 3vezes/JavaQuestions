package com.ic;


import org.junit.Assert;
import org.junit.Test;

public class PermutationPalindromeTest {

    @Test
    public void testPermutationPalindrome() throws Exception {
        Assert.assertTrue(PermutationPalindrome.isValid("civic"));
        Assert.assertTrue(PermutationPalindrome.isValid("ivicc"));
        Assert.assertFalse(PermutationPalindrome.isValid("civil"));
        Assert.assertFalse(PermutationPalindrome.isValid("livci"));
    }

    @Test
    public void testLongPalindrome() throws Exception {
        Assert.assertTrue(PermutationPalindrome.isValid("are we not drawn onward to new era"));
        Assert.assertTrue(PermutationPalindrome.isValid("era we not new onward to are drawn"));
    }
}
