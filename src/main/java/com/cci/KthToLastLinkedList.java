package com.cci;

import com.data.LinkedListElement;

public class KthToLastLinkedList {

    public static <T> T find(LinkedListElement<T> head, int kthToLast) {
        //Move the head k positions.
        LinkedListElement<T> behindPointer = head;
        LinkedListElement<T> currentPointer = head;

        for (int i = 0; i < kthToLast; i++) {
            if (currentPointer.getNext() == null) {
                throw new IllegalArgumentException("The list isn't long enough.");
            }

            currentPointer = currentPointer.getNext();
        }

        //Increment the pointer as we move to the end.
        while (currentPointer.getNext() != null) {
            behindPointer = behindPointer.getNext();
            currentPointer = currentPointer.getNext();
        }

        return behindPointer.getData();
    }
}
