package com.pie;

import com.data.BinaryNode;
import com.google.common.collect.Lists;

import java.util.List;
import java.util.Stack;

/**
 * Perform a preorder traversal of a binary search tree, printing the value of each node.
 */
public final class PreorderTraversal {

    public static <T> List<T> traverse(BinaryNode<T> root){
        Stack<BinaryNode<T>> stack = new Stack<BinaryNode<T>>();
        List<T> traversalOrder = Lists.newArrayList();

        if(root == null){
            return Lists.newArrayList();
        }

        stack.push(root);

        while (!stack.isEmpty()){
            BinaryNode<T> current = stack.pop();
            traversalOrder.add(current.getValue());

            if(current.hasRight()){
                stack.push(current.getRight());
            }

            if(current.hasLeft()){
                stack.push(current.getLeft());
            }
        }

        return traversalOrder;
    }
}
