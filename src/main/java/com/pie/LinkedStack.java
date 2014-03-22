package com.pie;

import com.data.LinkedListElement;

/**
 * Implement a stack using either a linked list or dynamic array and justify your decision.
 * Design the interface to to you stack to be complete, consistent and easy to use.
 */
public class LinkedStack<T> {

    private LinkedListElement<T> head;

    public void push(T element){
        //This element become the new head.
        head = new LinkedListElement<T>(element,head);
    }

    public T pop(){
        if(head == null){
            //List is already empty.
            return null;
        }

        T data = head.getData();
        head = head.getNext();
        return data;
    }

    public T peek(){
        return head.getData();
    }
}
