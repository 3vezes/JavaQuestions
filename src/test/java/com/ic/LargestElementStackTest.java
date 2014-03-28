package com.ic;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class LargestElementStackTest {

    LargestElementStack<Integer> largestElementStack;

    @Before
    public void setUp() throws Exception {
        largestElementStack = new LargestElementStack<Integer>();
    }

    @Test
    public void testHasLargest() throws Exception {
        largestElementStack.push(1);
        largestElementStack.push(5);
        largestElementStack.push(2);

        Assert.assertEquals(Integer.valueOf(5),largestElementStack.getLargest());

        //Removed 2
        largestElementStack.pop();

        //Removed 5
        largestElementStack.pop();

        Assert.assertEquals(Integer.valueOf(1),largestElementStack.getLargest());
    }

    @Test
    public void testIncrementing() throws Exception {
        for(int i = 0 ; i < 100; i++){
            largestElementStack.push(i);
        }

        for(int i = 99 ; i >= 0  ; i--){
            Assert.assertEquals(Integer.valueOf(i),largestElementStack.getLargest());
            largestElementStack.pop();
        }

        Assert.assertTrue(largestElementStack.isEmpty());
    }
}
