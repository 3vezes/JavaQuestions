package com.cci;

import com.data.LinkedListElement;
import org.junit.Assert;
import org.junit.Test;

public class LinkedListDuplicatesTest {

    @Test
    public void testSingleElement() throws Exception {
        LinkedListElement<Integer> head = new LinkedListElement<Integer>(0, null);
        Assert.assertEquals(head, LinkedListDuplicates.removeDuplicated(head));
    }

    @Test
    public void testFirstDup() throws Exception {
        LinkedListElement<Integer> third = new LinkedListElement<Integer>(1, null);
        LinkedListElement<Integer> second = new LinkedListElement<Integer>(0, third);
        LinkedListElement<Integer> first = new LinkedListElement<Integer>(0, second);

        LinkedListElement<Integer> current = LinkedListDuplicates.removeDuplicated(first);
        for (int i = 0; i < 2; i++) {
            Assert.assertEquals(Integer.valueOf(i), current.getData());
            current = current.getNext();
        }
    }
}
