package com.cci;

import com.data.LinkedListElement;
import org.junit.Assert;
import org.junit.Test;

public class KthToLastLinkedListTest {

    @Test
    public void testEmpty() throws Exception {
        Assert.assertEquals(Integer.valueOf(0), KthToLastLinkedList.find(new LinkedListElement<Integer>(0, null), 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testShort() throws Exception {
        KthToLastLinkedList.find(new LinkedListElement<Integer>(0, null), 2);
    }

    @Test
    public void testSimple() throws Exception {
        LinkedListElement<Integer> third = new LinkedListElement<Integer>(3, null);
        LinkedListElement<Integer> second = new LinkedListElement<Integer>(2, third);
        LinkedListElement<Integer> first = new LinkedListElement<Integer>(1, second);

        int result = KthToLastLinkedList.find(first, 2);
        Assert.assertEquals(1, result);

        int secondResult = KthToLastLinkedList.find(first, 1);
        Assert.assertEquals(2, secondResult);

        int thirdResult = KthToLastLinkedList.find(first, 0);
        Assert.assertEquals(3, thirdResult);
    }
}