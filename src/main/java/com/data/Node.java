package com.data;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;

import java.util.List;

public class Node<T> {

    private T value;
    private List<Node<T>> children = Lists.newArrayList();

    public Node(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void addChild(T child){
        children.add(new Node<T>(child));
    }

    public void addChild(Node<T> child){
        children.add(child);
    }

    public List<Node<T>> getChildren() {
        return Lists.newArrayList(children);
    }

    public boolean hasChild(T child){
        return children.contains(new Node<T>(child));
    }

    public Node<T> getChild(T child){
        Node<T> node = new Node<T>(child);
        Preconditions.checkArgument(children.contains(node), "Child does not exist");
        int position = children.indexOf(node);
        return children.get(position);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Node node = (Node) o;

        if (value != null ? !value.equals(node.value) : node.value != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return value != null ? value.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", children=" + children +
                '}';
    }
}
