package com.cci;

import com.data.tree.BinaryNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for tree util class.
 */
public class TreeUtilTest {

    private BinaryNode<Integer> binaryTree;
    private BinaryNode<Integer> binarySearchTree;

    @Before
    public void setUp() throws Exception {
        //Create binary tree.
        binaryTree = createBinaryTree();
        binarySearchTree = createBinarySearchTree();
    }

    private BinaryNode<Integer> createBinarySearchTree() {
        BinaryNode<Integer> fiveNode = new BinaryNode<Integer>(5);
        BinaryNode<Integer> fourNode = new BinaryNode<Integer>(null,fiveNode,4);
        BinaryNode<Integer> nineNode = new BinaryNode<Integer>(9);
        BinaryNode<Integer> eightNode = new BinaryNode<Integer>(fourNode,nineNode,8);
        BinaryNode<Integer> elevenNode = new BinaryNode<Integer>(11);
        BinaryNode<Integer> twelveNode = new BinaryNode<Integer>(elevenNode,null,12);
        return new BinaryNode<Integer>(eightNode,twelveNode,10);
    }

    private BinaryNode<Integer> createBinaryTree() {
        BinaryNode<Integer> tenNode = new BinaryNode<Integer>(10);
        BinaryNode<Integer> twelveNode = new BinaryNode<Integer>(tenNode,null,12);
        BinaryNode<Integer> eightNode = new BinaryNode<Integer>(8);
        BinaryNode<Integer> nineNode = new BinaryNode<Integer>(eightNode,twelveNode,9);
        BinaryNode<Integer> elevenNode = new BinaryNode<Integer>(11);
        BinaryNode<Integer> fourNode = new BinaryNode<Integer>(elevenNode,null,4);
        return new BinaryNode<Integer>(nineNode,fourNode,5);
    }

    @Test
    public void testIsBinarySearchTree(){
        Assert.assertTrue(TreeUtil.isBinarySearchTree(binarySearchTree));
        Assert.assertFalse(TreeUtil.isBinarySearchTree(binaryTree));
    }

}
