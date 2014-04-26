package com.cci;

import com.data.BinaryNode;

import java.util.Stack;

/**
 * You have two very large binary trees: T1, with millions of nodes, and T2, with hundreds of nodes.
 * Create an algorithm to decide if T2 is a subtree of T1.
 * <p/>
 * A tree T2 is a subtree of T1 if there exists a node n in T1 such that the subtree of n is identical to T2.
 * That is, if you cut off the tree at node n, the two trees would be identical.
 */
public final class BinaryNodeSubtree {

    public static <T> boolean isSubtree(BinaryNode<T> largeTree, BinaryNode<T> smallTree) {
        if (smallTree == null) {
            return true;
        }

        //Find candidate root.
        Stack<BinaryNode<T>> stack = new Stack<BinaryNode<T>>();
        stack.push(largeTree);

        while (!stack.isEmpty()) {
            BinaryNode<T> current = stack.pop();
            if (current.getValue().equals(smallTree.getValue())) {
                //Found a common root. Look for subtree match.
                if (isMatchFromRoot(current, smallTree)) {
                    return true;
                }
            }

            //Insert the children.
            if (current.hasLeft()) {
                stack.push(current.getLeft());
            }

            if (current.hasRight()) {
                stack.push(current.getRight());
            }
        }


        //Can't find a subtree.
        return false;
    }

    private static <T> boolean isMatchFromRoot(BinaryNode<T> current, BinaryNode<T> smallTree) {
        if (current == null && smallTree == null) {
            return true;
        }

        if (current == null || smallTree == null) {
            return false;
        }

        if (!current.getValue().equals(smallTree.getValue())) {
            return false;
        }

        return isMatchFromRoot(current.getLeft(), smallTree.getLeft())
                && isMatchFromRoot(current.getRight(), smallTree.getRight());
    }
}
