package com.cci;

import com.data.BinaryNode;
import com.data.LinkedListElement;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * Given a binary tree, design an algorithm which creates a linked list
 * of all the nodes at each depth.
 */
public class BinaryTreeLevels {

    public static <T> List<LinkedListElement<T>> getLevels(BinaryNode<T> root) {
        List<LinkedListElement<T>> results = Lists.newArrayList();
        recurseLevels(root, 0, results);
        return results;
    }

    private static <T> void recurseLevels(BinaryNode<T> node, int level, List<LinkedListElement<T>> results) {
        if (node == null) {
            return;
        }

        if (results.size() <= level) {
            results.add(new LinkedListElement<T>(node.getValue(), null));
        } else {
            LinkedListElement<T> temp = results.get(level);
            LinkedListElement<T> newElement = new LinkedListElement<T>(node.getValue(), temp);
            results.set(level, newElement);
        }

        recurseLevels(node.getLeft(), level + 1, results);
        recurseLevels(node.getRight(), level + 1, results);
    }
}
