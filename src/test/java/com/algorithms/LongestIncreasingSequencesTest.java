package com.algorithms;

import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class LongestIncreasingSequencesTest {

    @Test
    public void testLongestIncreasing1() throws Exception {
        List<Integer> testSequence = Lists.newArrayList(7,2,8,1,3,4,10,6,9,5);
        Assert.assertEquals(Lists.newArrayList(1,3,4,6,9),LongestIncreasingSequences.find(testSequence));
    }
}
