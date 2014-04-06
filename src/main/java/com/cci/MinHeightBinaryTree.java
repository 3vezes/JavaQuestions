package com.cci;

import com.data.BinaryNode;
import com.google.common.collect.Lists;

import java.util.Collections;
import java.util.List;

/**
 * Given a sorted increasing order array, write an algorithm to create a binary
 * search tree with minimal height.
 */
public final class MinHeightBinaryTree {


    /**
     * Continually partition the list finding the middle element to add to the tree.
     * @param items
     * @return
     */
    public static BinaryNode<Integer> createBalanced(List<Integer> items){
        List<Integer> unsortedItems = Lists.newArrayList(items);
        Collections.sort(unsortedItems);
        return recursiveInsert(unsortedItems);
    }

    private static BinaryNode<Integer> recursiveInsert(List<Integer> items) {
        if(items.isEmpty()){
            return null;
        }

        int selected = items.remove(items.size()/2);
        BinaryNode<Integer> newNode = new BinaryNode<Integer>(selected);

        int middle = items.size()/2;
        List<Integer> leftHalf = Lists.newArrayList(items.subList(0,middle));
        List<Integer> rightHalf = Lists.newArrayList(items.subList(middle,items.size()));

        newNode.setLeft(recursiveInsert(leftHalf));
        newNode.setRight(recursiveInsert(rightHalf));

        return newNode;
    }
}
