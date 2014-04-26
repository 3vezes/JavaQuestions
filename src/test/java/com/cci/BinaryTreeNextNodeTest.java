package com.cci;

import com.data.BackTraceBinaryNode;
import com.google.common.collect.Maps;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

public class BinaryTreeNextNodeTest {

    Map<Integer, BackTraceBinaryNode<Integer>> nodeCache = Maps.newHashMap();
    BackTraceBinaryNode<Integer> root;

    @Before
    public void setUp() throws Exception {
        BackTraceBinaryNode<Integer> one = new BackTraceBinaryNode<Integer>(1);
        nodeCache.put(1, one);
        root = one;

        BackTraceBinaryNode<Integer> two = new BackTraceBinaryNode<Integer>(2);
        nodeCache.put(2, two);

        BackTraceBinaryNode<Integer> three = new BackTraceBinaryNode<Integer>(3);
        nodeCache.put(3, three);

        BackTraceBinaryNode<Integer> four = new BackTraceBinaryNode<Integer>(4);
        nodeCache.put(4, four);

        BackTraceBinaryNode<Integer> five = new BackTraceBinaryNode<Integer>(5);
        nodeCache.put(5, five);

        BackTraceBinaryNode<Integer> six = new BackTraceBinaryNode<Integer>(6);
        nodeCache.put(6, six);

        BackTraceBinaryNode<Integer> seven = new BackTraceBinaryNode<Integer>(7);
        nodeCache.put(7, seven);

        BackTraceBinaryNode<Integer> eight = new BackTraceBinaryNode<Integer>(8);
        nodeCache.put(8, eight);

        BackTraceBinaryNode<Integer> nine = new BackTraceBinaryNode<Integer>(9);
        nodeCache.put(9, nine);

        //Build tree structure.
        one.setLeft(two);
        one.setRight(three);

        two.setParent(one);
        two.setLeft(four);
        two.setRight(five);

        four.setParent(two);

        five.setParent(two);
        five.setLeft(eight);

        eight.setParent(five);
        eight.setRight(nine);

        nine.setParent(eight);

        three.setParent(one);
        three.setLeft(six);
        three.setRight(seven);
    }

    @Test
    public void testRoot() throws Exception {
        Assert.assertEquals(Integer.valueOf(6), BinaryTreeNextNode.getNext(root));
    }

    @Test
    public void testNoChildren() throws Exception {
        //Left childless node.
        Assert.assertEquals(Integer.valueOf(2), BinaryTreeNextNode.getNext(nodeCache.get(4)));

        //Right childless node.
        Assert.assertEquals(Integer.valueOf(8),BinaryTreeNextNode.getNext(nodeCache.get(9)));
    }
}