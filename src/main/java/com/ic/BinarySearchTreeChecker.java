package com.ic;


import com.data.BinaryNode;

import java.util.Stack;

/**
 * Write a function to check that a binary tree is a valid binary search tree.
 */
public final class BinarySearchTreeChecker {

    private static class ValidationNode<T extends Comparable<T>> {
        private final T lowestAncestor;
        private final T highestAncestor;
        private final BinaryNode<T> node;

        private ValidationNode(T lowestAncestor, T highestAncestor, BinaryNode<T> node) {
            this.lowestAncestor = lowestAncestor;
            this.highestAncestor = highestAncestor;
            this.node = node;
        }

        public T getLowestAncestor() {
            return lowestAncestor;
        }

        public T getHighestAncestor() {
            return highestAncestor;
        }

        public BinaryNode<T> getNode() {
            return node;
        }
    }

    public static boolean isValid(BinaryNode<Integer> root) {
        Stack<ValidationNode<Integer>> stack = new Stack<ValidationNode<Integer>>();
        stack.push(new ValidationNode<Integer>(Integer.MIN_VALUE, Integer.MAX_VALUE, root));

        while (!stack.isEmpty()) {
            ValidationNode<Integer> current = stack.pop();
            BinaryNode<Integer> node = current.getNode();
            int value = node.getValue();
            if (value < current.getLowestAncestor() || value > current.getHighestAncestor()) {
                /**
                 * This node is invalid because it's either less than the lowest ancestor or greater that the
                 * highest ancestor for this path.
                 */
                return false;
            }

            if (node.hasLeft()) {
                stack.push(new ValidationNode<Integer>(current.getLowestAncestor(),
                        Math.min(current.getHighestAncestor(), value), node.getLeft()));
            }

            if (node.hasRight()) {
                stack.push(new ValidationNode<Integer>(
                        Math.max(value, current.getLowestAncestor()),
                        current.getHighestAncestor(), node.getRight()));
            }
        }

        return true;
    }
}
