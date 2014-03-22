package com.pie;

import com.data.LinkedListElement;

/**
 * Head and tail are pointers to the first and last element, of a singly linked
 * list of integers. Implement the following methods
 * <p/>
 * <code>
 * bool delete(element)
 * bool insertAfter(element, data)
 * </code>
 */
public class LinkedListTail<T> {

    LinkedListElement<T> head;
    LinkedListElement<T> tail;

    boolean delete(LinkedListElement<T> victim) {
        boolean result = false;

        //The list is empty.
        if(head == null || victim == null){
            return false;
        }

        LinkedListElement<T> previous = head;
        while (previous != null && !victim.equals(previous.getNext())){
            previous = previous.getNext();
        }

        if(previous != null && victim.equals(previous.getNext())){
            LinkedListElement<T> elementToDelete = previous.getNext();
            previous.setNext(elementToDelete.getNext());

            if(previous.getNext() == null){
                //Update the tail.
                tail = previous;
            }

            result = true;
        } else if(victim == head){
            //Check if item to delete is the head.
            head = null;
            tail = null;
            result = true;
        }


        return result;
    }


    boolean insertAfter(LinkedListElement<T> element, T data) {
        boolean returnValue = false;

        if (element == null) {
            head = new LinkedListElement<T>(data, head);
            returnValue = true;

            if (tail == null) {
                tail = head;
            }

        } else {
            LinkedListElement<T> current = head;
            while (current != null && !element.equals(current)) {
                current = current.getNext();
            }

            //Found what we're looking for.
            if (element.equals(current)) {
                LinkedListElement<T> newNode = new LinkedListElement<T>(data, null);

                if (current.getNext() != null) {
                    newNode.setNext(current.getNext());
                } else {
                    tail = newNode;
                }

                current.setNext(newNode);
                returnValue = true;
            }
        }

        return returnValue;
    }
}
