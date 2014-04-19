package com.cci;

import com.google.common.collect.Lists;

import java.util.*;
import java.util.Stack;

/**
 * Write a program to sort a stack in ascending order (with biggest items on top). You may use additional
 * stacks to hold items, but you may not copy the elements into any other structure (such as an array). The
 * stack supports the following operations: push,pop,peek and isEmpty().
 */
public final class SortedStack {

    public static <T extends Comparable<T>> List<T> sort(List<T> items) {
        Stack<T> sorted = new Stack<T>();
        Stack<T> reserve = new Stack<T>();

        for(T current : items){
            while (!sorted.isEmpty() && sorted.peek().compareTo(current) < 0){
                //Pop off items into the reserve stack.
                reserve.push(sorted.pop());
            }

            //Push on sorted stack it's where I belong now.
            sorted.push(current);

            //Empty the reserve back on the stack.
            while (!reserve.isEmpty()){
                sorted.push(reserve.pop());
            }
        }

        Collections.reverse(sorted);
        return Lists.newArrayList(sorted);
    }
}
