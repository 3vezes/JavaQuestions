package com.pie;

import com.data.LinkedListElement;
import org.junit.Assert;
import org.junit.Test;

public class LinkedListElementFromLastTest {

    LinkedListElement<Integer> head;

    @Test
    public void testSearchFromLast() throws Exception {
        head = new LinkedListElement<Integer>(0,null);

        LinkedListElement<Integer> oneElement = new LinkedListElement<Integer>(1,null);
        head.setNext(oneElement);

        LinkedListElement<Integer> twoElement = new LinkedListElement<Integer>(2,null);
        oneElement.setNext(twoElement);

        Assert.assertNull(LinkedListElementFromLast.searchFromLast(head, 100));
        Assert.assertEquals(twoElement, LinkedListElementFromLast.searchFromLast(head, 0));
        Assert.assertEquals(oneElement, LinkedListElementFromLast.searchFromLast(head, 1));
        Assert.assertEquals(head, LinkedListElementFromLast.searchFromLast(head, 2));
    }
}
