package main.java.com.cci;

import java.util.ArrayDeque;
import java.util.Deque;

import static com.google.common.base.Preconditions.checkState;

/**
 * Design a stack which, in addition to push and pop, also has
 * a function min which returns the minimum element? Push,pop and min
 * should all operate in O(1) time.
 */
public class ModifiedStack implements Stack<Integer>{

    private final Deque<Integer> container = new ArrayDeque<>();
    private final Deque<Integer> currentMin = new ArrayDeque<>();

    @Override
    public void push(Integer item) {
        if(currentMin.isEmpty() || (currentMin.peek() >= item)){
            currentMin.push(item);
        }

        container.push(item);
    }

    @Override
    public Integer pop() {
        int top = container.pop();

        if(top == currentMin.peek()){
            currentMin.pop();
        }

        return top;
    }

    @Override
    public Integer peek() {
        return container.peek();
    }

    @Override
    public Integer min() {
        checkState(!currentMin.isEmpty(), "The stack is empty.");
        return currentMin.peek();
    }
}

interface Stack<T>{
    void push(T item);
    T pop();
    T peek();
    T min();
}

