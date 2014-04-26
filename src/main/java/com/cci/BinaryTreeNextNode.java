package com.cci;

import com.data.BackTraceBinaryNode;
import com.data.BinaryNode;

/**
 * Write and algorithm to find the 'next' node (i.e, in-order of successor) of a given
 * node in a binary tree. You may assume each node has a link to its parent.
 */
public final class BinaryTreeNextNode {

    public static <T> T getNext(BackTraceBinaryNode<T> node) {

        /**
         * 1. Left most node of right subtree if if node has right.
         * 2. If we're the left node of our parent our next node is the parent.
         */

        if (node.hasRight()) {
            //Return left most child of right subtree.
            return traverseLeft(node.getRight());
        } else {
            BackTraceBinaryNode<T> current = node;
            BackTraceBinaryNode<T> parent = current.getParent();
            while (parent != null && parent.hasLeft() && parent.getLeft().getValue() != current.getValue()) {
                current = parent;
                parent = parent.getParent();
            }

            return parent.getValue();
        }
    }

    private static <T> T traverseLeft(BinaryNode<T> node) {
        if (node.hasLeft()) {
            return traverseLeft(node.getLeft());
        } else {
            return node.getValue();
        }
    }
}
