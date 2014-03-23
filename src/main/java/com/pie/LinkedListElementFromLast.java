package com.pie;

import com.data.LinkedListElement;

/**
 * Given a singly linked list, devise a time and space efficient algorithm
 * to find the mth-to-last element of the list. Implement your algorithm, taking
 * care to handle relevant error conditions. Define mth to last such that when m = 0
 * the last element of the list is returned.
 */
public class LinkedListElementFromLast {

    public static <T> LinkedListElement<T> searchFromLast(LinkedListElement<T> head, int fromLast){
        LinkedListElement<T> currentElement = head;

        //Iterate mth places in the list.
        for(int i = 0 ; i < fromLast ; i++){
            if(currentElement.getNext() != null){
                currentElement = currentElement.getNext();
            } else {
                // The from position is greater than the list.
                return null;
            }
        }

        LinkedListElement<T> behindElement = head;
        while (currentElement.getNext() != null){
            currentElement = currentElement.getNext();
            behindElement = behindElement.getNext();
        }

        return behindElement;
    }
}
