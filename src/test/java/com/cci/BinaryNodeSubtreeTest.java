package com.cci;

import com.data.BinaryNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinaryNodeSubtreeTest {

    private BinaryNode<Integer> largeTree;
    private BinaryNode<Integer> validSubtree;
    private BinaryNode<Integer> invalidSubtree;

    @Before
    public void setUp() throws Exception {
        BinaryNode<Integer> one = new BinaryNode<Integer>(1);
        largeTree = one;

        BinaryNode<Integer> two = new BinaryNode<Integer>(2);

        BinaryNode<Integer> three = new BinaryNode<Integer>(3);

        BinaryNode<Integer> four = new BinaryNode<Integer>(4);

        BinaryNode<Integer> five = new BinaryNode<Integer>(5);

        BinaryNode<Integer> six = new BinaryNode<Integer>(6);

        BinaryNode<Integer> seven = new BinaryNode<Integer>(7);

        BinaryNode<Integer> eight = new BinaryNode<Integer>(8);

        BinaryNode<Integer> nine = new BinaryNode<Integer>(9);

        //Build tree structure.
        one.setLeft(two);
        one.setRight(three);

        two.setLeft(four);
        two.setRight(five);

        five.setLeft(eight);

        eight.setRight(nine);

        three.setLeft(six);
        three.setRight(seven);

        validSubtree = new BinaryNode<Integer>(5);
        BinaryNode<Integer> validLeft = new BinaryNode<Integer>(8);
        validLeft.setRight(new BinaryNode<Integer>(9));
        validSubtree.setLeft(validLeft);

        invalidSubtree = new BinaryNode<Integer>(6);
        invalidSubtree.setLeft(new BinaryNode<Integer>(3));
        invalidSubtree.setRight(new BinaryNode<Integer>(7));
    }

    @Test
    public void testInvalidSubtree() throws Exception {
        Assert.assertFalse(BinaryNodeSubtree.isSubtree(largeTree,invalidSubtree));
    }

    @Test
    public void testValidSubtree() throws Exception {
        Assert.assertTrue(BinaryNodeSubtree.isSubtree(largeTree,validSubtree));
    }

}