package com.pie;


import com.data.BinaryNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LowestCommonAncestorTest {

    private BinaryNode<Integer> root;

    @Before
    public void setUp() throws Exception {
        root = new BinaryNode<Integer>(20);

        BinaryNode<Integer> eight = new BinaryNode<Integer>(8);
        BinaryNode<Integer> twentyTwo = new BinaryNode<Integer>(22);
        root.setLeft(eight);
        root.setRight(twentyTwo);

        BinaryNode<Integer> four = new BinaryNode<Integer>(4);
        BinaryNode<Integer> twelve = new BinaryNode<Integer>(12);
        eight.setLeft(four);
        eight.setRight(twelve);

        BinaryNode<Integer> ten = new BinaryNode<Integer>(10);
        BinaryNode<Integer> fourteen = new BinaryNode<Integer>(14);
        twelve.setLeft(ten);
        twelve.setRight(fourteen);
    }

    @Test
    public void testFindLCA() throws Exception {
        Assert.assertEquals(8, LowestCommonAncestor.find(root,4,14));
    }
}
