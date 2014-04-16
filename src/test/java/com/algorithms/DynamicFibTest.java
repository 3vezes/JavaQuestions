package com.algorithms;


import org.junit.Assert;
import org.junit.Test;

public final class DynamicFibTest {

    @Test
    public void testFibTests() throws Exception {
        Assert.assertEquals(0, DynamicFib.fib(0));
        Assert.assertEquals(1, DynamicFib.fib(1));
        Assert.assertEquals(5, DynamicFib.fib(5));
        Assert.assertEquals(8, DynamicFib.fib(6));
    }
}
