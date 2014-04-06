package com.cci;


import com.google.common.collect.Sets;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

public class ParenthesesCombinationsTest {

    Set<String> onePair;
    Set<String> twoPairs;
    Set<String> threePairs;

    @Before
    public void setUp() throws Exception {
        onePair = Sets.newHashSet("()");
        twoPairs = Sets.newHashSet("(())", "()()");
        threePairs = Sets.newHashSet("((()))", "(()())", "(())()", "()(())", "()()()");
    }

    @Test
    public void testPermutations() throws Exception {
        Assert.assertEquals(onePair, ParenthesesCombinations.generate(1));
        Assert.assertEquals(twoPairs, ParenthesesCombinations.generate(2));
        Assert.assertEquals(threePairs, ParenthesesCombinations.generate(3));
    }

    @Test
    public void testPermutation2() throws Exception {
        Assert.assertEquals(onePair, ParenthesesCombinations.generate2(1));
        Assert.assertEquals(twoPairs, ParenthesesCombinations.generate2(2));
        Assert.assertEquals(threePairs, ParenthesesCombinations.generate2(3));
    }
}
