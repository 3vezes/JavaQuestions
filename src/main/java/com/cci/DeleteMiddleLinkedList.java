package com.cci;

import com.data.LinkedListElement;

/**
 * Implement an algorithm to delete a node in the middle of a singly linked list,
 * given only access to that node.
 * <p/>
 * Input: the node c from the linked list a -> b -> c -> d -> e
 * Result nothing is returned, but the new linked list looks like a -> b -> d -> e
 */
public class DeleteMiddleLinkedList {

    /**
     * Instead of deleting myself I'm going to look
     * like the next guy and then delete him.
     *
     * @param <T>
     */
    public static <T> void delete(LinkedListElement<T> victim) {
        if (victim.getNext() == null) {
            return;
        }

        LinkedListElement<T> nextNode = victim.getNext();
        victim.setData(nextNode.getData());
        victim.setNext(nextNode.getNext());
    }
}
