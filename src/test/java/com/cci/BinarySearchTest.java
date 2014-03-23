package com.cci;

import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class BinarySearchTest {

    private static final List<Integer> sortedItems = Lists.newArrayList(1,2,3,4,5,6,7,8,9,10);

    @Test
    public void testSearch() throws Exception {
        for(int item : sortedItems){
            Assert.assertEquals(Integer.valueOf(item),BinarySearch.search(sortedItems,item));
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testElementNotFound() throws Exception {
        BinarySearch.search(sortedItems,100);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegative() throws Exception {
        BinarySearch.search(sortedItems,-100);

    }
}
