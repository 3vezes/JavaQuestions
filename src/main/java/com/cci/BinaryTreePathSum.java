package com.cci;

import com.data.tree.BinaryNode;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import java.util.List;
import java.util.Set;

/**
 * You are given a binary tree in which each node contains a value.
 * Design an algorithm to print all paths which sum to a given values.
 * Not that a path can start or end anywhere in the tree.
 */
public class BinaryTreePathSum {

    public static class Path {

        List<Integer> path;

        public Path(Path otherPath) {
            this(otherPath.getPath());
        }

        public Path() {
            this(Lists.<Integer>newArrayList());
        }

        public Path(List<Integer> path) {
            this.path = Lists.newArrayList(path);
        }

        public List<Integer> getPath() {
            return path;
        }

        public void add(int value) {
            path.add(value);
        }

        public int getSum() {
            int result = 0;
            for (Integer value : path) {
                result += value;
            }

            return result;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Path path1 = (Path) o;

            return !(path != null ? !path.equals(path1.path) : path1.path != null);
        }

        @Override
        public int hashCode() {
            return path != null ? path.hashCode() : 0;
        }

        @Override
        public String toString() {
            return "Path{" +
                    "path=" + path +
                    '}';
        }
    }

    /**
     * Returns a collection of paths which equal the target sum.
     *
     * @return
     */
    public static Set<Path> getPathsToSum(BinaryNode<Integer> startingNode, int targetSum) {
        Set<Path> results = Sets.newHashSet();
        recursePathToSum(startingNode, targetSum, results, new Path());
        return results;
    }

    private static void recursePathToSum(BinaryNode<Integer> current, int targetSum, Set<Path> validPaths, Path path) {
        if (current == null) {
            return;
        }

        if (current.getValue() + path.getSum() == targetSum) {
            //Found a valid path.
            path.add(current.getValue());
            validPaths.add(path);
        } else {
            path.add(current.getValue());
        }

        recursePathToSum(current.getLeft(), targetSum, validPaths, new Path(path));
        recursePathToSum(current.getRight(), targetSum, validPaths, new Path(path));
    }
}
