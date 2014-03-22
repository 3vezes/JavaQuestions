package com.pie;

import com.data.LinkedListElement;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class LinkedListTailTest {

    LinkedListTail<Integer> linkedListTail;

    @Before
    public void setUp() throws Exception {
        linkedListTail = new LinkedListTail<Integer>();
    }

    @Test
    public void testDelete() throws Exception {
        Assert.assertFalse(linkedListTail.delete(null));

        linkedListTail.insertAfter(null,5);
        Assert.assertEquals(linkedListTail.head,linkedListTail.tail);

        Assert.assertTrue(linkedListTail.delete(linkedListTail.head));
        Assert.assertNull(linkedListTail.head);
        Assert.assertNull(linkedListTail.tail);

        linkedListTail.insertAfter(null,5);
        linkedListTail.insertAfter(null,10);
        Assert.assertTrue(linkedListTail.delete(linkedListTail.tail));
        Assert.assertEquals(linkedListTail.head,linkedListTail.tail);

        linkedListTail.insertAfter(null,20);
        linkedListTail.insertAfter(null,30);
        Assert.assertTrue(linkedListTail.delete(linkedListTail.head.getNext()));
        Assert.assertEquals(Integer.valueOf(30),linkedListTail.head.getData());
        Assert.assertEquals(Integer.valueOf(10),linkedListTail.tail.getData());
    }

    @Test
    public void testInsertAfter() throws Exception {
        //Five should be the new head. Tail should also equal head.
        Assert.assertTrue(linkedListTail.insertAfter(null,5));
        Assert.assertEquals(linkedListTail.head, linkedListTail.tail);
        Assert.assertEquals(linkedListTail.head.getData(), Integer.valueOf(5));

        //Insert after the head.
        LinkedListElement<Integer> head = linkedListTail.head;
        Assert.assertTrue(linkedListTail.insertAfter(head,10));
        Assert.assertEquals(Integer.valueOf(10),linkedListTail.tail.getData());
        Assert.assertEquals(Integer.valueOf(5),linkedListTail.head.getData());

        Assert.assertFalse(linkedListTail.insertAfter(new LinkedListElement<Integer>(20,null),30));
    }
}
