package com.cci;

import com.data.BinaryNode;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;

import java.util.List;

/**
 * Implement a function to check if a binary tree is a binary search tree.
 *
 * Perform an in-order traversal to see if the given set is sorted.
 */
public final class TreeUtil {

    public static boolean isBinarySearchTree(BinaryNode<Integer> binaryTree){
        List<Integer> results = traverseInOrder(binaryTree);
        return Ordering.natural().isOrdered(results);
    }

    private static List<Integer> traverseInOrder(BinaryNode<Integer> node){
        List<Integer> leftResult = node.hasLeft() ? traverseInOrder(node.getLeft()) : Lists.<Integer>newArrayList();
        Integer current = node.getValue();
        List<Integer> rightResult = node.hasRight() ? traverseInOrder(node.getRight()) : Lists.<Integer>newArrayList();

        leftResult.add(current);
        leftResult.addAll(rightResult);

        return leftResult;
    }


}
