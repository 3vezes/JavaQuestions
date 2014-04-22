package com.cci;

import com.data.LinkedListElement;
import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class DeleteMiddleLinkedListTest {

    @Test
    public void testDeleteMiddle() throws Exception {
        LinkedListElement<String> e = new LinkedListElement<String>("e",null);
        LinkedListElement<String> d = new LinkedListElement<String>("d",e);
        LinkedListElement<String> c = new LinkedListElement<String>("c",d);
        LinkedListElement<String> b = new LinkedListElement<String>("b",c);
        LinkedListElement<String> a = new LinkedListElement<String>("a",b);

        DeleteMiddleLinkedList.delete(c);

        List<String> expectedList = Lists.newArrayList("a","b","d","e");

        LinkedListElement<String> current = a;
        int count = 0;
        while (current != null){
            Assert.assertEquals(expectedList.get(count),current.getData());
            current = current.getNext();
            count++;
        }

    }
}