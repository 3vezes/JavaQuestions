package com.pie;

import com.data.BinaryNode;

/**
 * Write a function to calculate the height of an arbitrary binary tree.
 */
public final class TreeHeight {

    public static <T> int findHeight(BinaryNode<T> root) {
        if (root == null) {
            return 0;
        } else {
            return 1 + Math.max(findHeight(root.getLeft()),findHeight(root.getRight()));
        }
    }
}
