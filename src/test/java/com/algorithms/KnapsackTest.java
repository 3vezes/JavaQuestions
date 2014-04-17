package com.algorithms;


import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class KnapsackTest {

    @Test
    public void testUnbounded() throws Exception {
        List<Knapsack.Item> items = Lists.newArrayList();
        items.add(Knapsack.Item.newInstance(6,30));
        items.add(Knapsack.Item.newInstance(3,14));
        items.add(Knapsack.Item.newInstance(4,16));
        items.add(Knapsack.Item.newInstance(2,9));

        Assert.assertEquals(46, Knapsack.getBoundedMaxWeight(items, 10));
        Assert.assertEquals(48, Knapsack.getUnboundedMaxWeight(items,10));
    }
}
