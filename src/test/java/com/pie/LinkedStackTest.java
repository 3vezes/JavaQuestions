package com.pie;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class LinkedStackTest {

    LinkedStack<Integer> stack;

    @Before
    public void setUp() throws Exception {
        stack = new LinkedStack<Integer>();

        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.push(0);
    }

    @Test
    public void testPush() throws Exception {
        stack.push(6);
        Assert.assertEquals(Integer.valueOf(6),stack.peek());
    }

    @Test
    public void testPop() throws Exception {
        Assert.assertEquals(Integer.valueOf(0),stack.pop());
        Assert.assertEquals(Integer.valueOf(1),stack.pop());
        Assert.assertEquals(Integer.valueOf(2),stack.pop());
        Assert.assertEquals(Integer.valueOf(3),stack.pop());
        Assert.assertEquals(Integer.valueOf(4),stack.pop());
        Assert.assertEquals(Integer.valueOf(5),stack.pop());
        Assert.assertNull(stack.pop());
    }

    @Test
    public void testPeek() throws Exception {
        Assert.assertEquals(Integer.valueOf(0),stack.peek());
    }
}
