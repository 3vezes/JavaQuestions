package com.pie;

import com.data.BinaryNode;
import com.google.common.base.Preconditions;

/**
 * Given the value of two nodes in a binary search tree, find the lowest (nearest)
 * common ancestor. You may assume that both values already exist in the tree.
 */
public final class LowestCommonAncestor {

    public static int find(BinaryNode<Integer> root, int node1, int node2){
        if(root == null){
            Preconditions.checkNotNull(root,"The root null cannot be null.");
        }

        BinaryNode<Integer> current = root;
        while (current != null){
            if(node1 > current.getValue() && node2 > current.getValue()){
                current = current.getRight();
            } else if(node1 < current.getValue() && node2 < current.getValue()){
                current = current.getLeft();
            } else {
                return current.getValue();
            }
        }

        return -1;
    }
}
