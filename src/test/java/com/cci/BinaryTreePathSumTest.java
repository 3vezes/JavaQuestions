package com.cci;


import com.data.tree.BinaryNode;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

public class BinaryTreePathSumTest {

    private BinaryNode<Integer> root;

    @Before
    public void setUp() throws Exception {
        //Leaf nodes
        BinaryNode<Integer> minusSix = new BinaryNode<Integer>(-6);
        BinaryNode<Integer> one = new BinaryNode<Integer>(1);
        BinaryNode<Integer> two = new BinaryNode<Integer>(2);

        //Depth 2
        BinaryNode<Integer> ten = new BinaryNode<Integer>(minusSix, null, 10);
        BinaryNode<Integer> negativeTwo = new BinaryNode<Integer>(one, null, -2);
        BinaryNode<Integer> four = new BinaryNode<Integer>(negativeTwo, null, 4);

        //Depth 1
        BinaryNode<Integer> six = new BinaryNode<Integer>(ten, four, 6);
        BinaryNode<Integer> eight = new BinaryNode<Integer>(two, four, 8);

        //Root
        root = new BinaryNode<Integer>(six, eight, 5);
    }

    @Test
    public void testPathToSum() throws Exception {
        //Expected paths
        BinaryTreePathSum.Path path1 = new BinaryTreePathSum.Path(Lists.newArrayList(5, 6, 4));
        BinaryTreePathSum.Path path2 = new BinaryTreePathSum.Path(Lists.newArrayList(5, 8, 2));
        BinaryTreePathSum.Path path3 = new BinaryTreePathSum.Path(Lists.newArrayList(5, 6, 10, -6));
        BinaryTreePathSum.Path path4 = new BinaryTreePathSum.Path(Lists.newArrayList(5, 8, 4, -2));

        Set<BinaryTreePathSum.Path> pathSet = Sets.newHashSet(path1, path2, path3, path4);

        Assert.assertEquals(pathSet, BinaryTreePathSum.getPathsToSum(root, 15));

    }
}
