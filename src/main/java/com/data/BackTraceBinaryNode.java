package com.data;


public class BackTraceBinaryNode<T> extends BinaryNode<T>{

    private BackTraceBinaryNode<T> parent;

    public BackTraceBinaryNode(T value) {
        super(value);
    }

    public BackTraceBinaryNode(BinaryNode<T> left, BinaryNode<T> right, T value) {
        super(left, right, value);
    }

    public BackTraceBinaryNode<T> getParent() {
        return parent;
    }

    public void setParent(BackTraceBinaryNode<T> parent) {
        this.parent = parent;
    }
}
