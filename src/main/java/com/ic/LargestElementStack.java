package com.ic;


import java.util.Stack;

public class LargestElementStack<T extends Comparable<T>> extends Stack<T>{

    private Stack<T> largestStack = new Stack<T>();

    @Override
    public T push(T item) {
        //Item is larger than anything we've seen before.
        if(largestStack.isEmpty() || item.compareTo(largestStack.peek()) >= 0){
            largestStack.push(item);
        }

        return super.push(item);
    }

    @Override
    public synchronized T pop() {
        T popped = super.pop();

        if(!largestStack.isEmpty() && popped.equals(largestStack.peek())){

            largestStack.pop();
        }

        return popped;
    }

    @Override
    public synchronized T peek() {
        return super.peek();
    }

    public T getLargest(){
        return largestStack.peek();
    }
}
