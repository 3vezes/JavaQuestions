package com.data;


public class LinkedListElement<T> {

    private T data;
    private LinkedListElement<T> next;

    public LinkedListElement(T data, LinkedListElement<T> next) {
        this.data = data;
        this.next = next;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setNext(LinkedListElement<T> next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public LinkedListElement<T> getNext() {
        return next;
    }
}
