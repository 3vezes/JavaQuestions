package com.cci;

import com.data.LinkedListElement;
import com.google.common.collect.Sets;

import java.util.Set;

/**
 * Write code to remove duplicated from an unsorted linked list.
 */
public final class LinkedListDuplicates {

    public static <T> LinkedListElement<T> removeDuplicated(LinkedListElement<T> linkedList) {
        //If it contains only a single element return. Dups not possible.
        if (linkedList.getNext() == null) {
            return linkedList;
        }

        Set<T> nodeSet = Sets.newHashSet();

        LinkedListElement<T> previous = linkedList;
        nodeSet.add(previous.getData());

        LinkedListElement<T> current = previous.getNext();

        while (current != null) {
            if (nodeSet.contains(current.getData())) {
                //Delete this node.
                previous.setNext(current.getNext());
            } else {
                nodeSet.add(current.getData());
            }

            previous = current;
            current = previous.getNext();
        }

        return linkedList;
    }
}
