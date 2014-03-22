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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LinkedListElement that = (LinkedListElement) o;

        if (data != null ? !data.equals(that.data) : that.data != null) return false;
        if (next != null ? !next.equals(that.next) : that.next != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = data != null ? data.hashCode() : 0;
        result = 31 * result + (next != null ? next.hashCode() : 0);
        return result;
    }
}
