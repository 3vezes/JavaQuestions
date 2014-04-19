package com.cci;

import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

public class SortedStackTest {

    @Test
    public void testSort() throws Exception {
        List<Integer> unsorted = Lists.newArrayList(9,8,7,6,5,4,3,2,1);
        List<Integer> sorted = Lists.newArrayList(unsorted);
        Collections.sort(sorted);

        Assert.assertEquals(sorted,SortedStack.sort(unsorted));
        Assert.assertEquals(sorted,SortedStack.sort(sorted));
    }
}
