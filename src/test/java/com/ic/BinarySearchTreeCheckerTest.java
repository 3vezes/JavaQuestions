package com.ic;


import com.data.BinaryNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinarySearchTreeCheckerTest {

    private BinaryNode<Integer> validSearchTree;
    private BinaryNode<Integer> invalidSearchTree;

    @Before
    public void setUp() throws Exception {
        invalidSearchTree = buildInvalidTree();
        validSearchTree = buildValidTree();
    }

    private static BinaryNode<Integer> buildInvalidTree() {
        BinaryNode<Integer> root = new BinaryNode<Integer>(50);

        BinaryNode<Integer> thirty = new BinaryNode<Integer>(30);
        BinaryNode<Integer> eighty = new BinaryNode<Integer>(80);
        BinaryNode<Integer> twenty = new BinaryNode<Integer>(20);
        BinaryNode<Integer> sixty = new BinaryNode<Integer>(60);
        BinaryNode<Integer> seventy = new BinaryNode<Integer>(70);
        BinaryNode<Integer> ninety = new BinaryNode<Integer>(90);

        root.setLeft(thirty);
        root.setRight(eighty);

        thirty.setLeft(twenty);
        //Danger zone! This node makes the tree invalid.
        thirty.setRight(sixty);

        eighty.setLeft(seventy);
        eighty.setRight(ninety);

        return root;
    }

    private static BinaryNode<Integer> buildValidTree(){
        BinaryNode<Integer> root = new BinaryNode<Integer>(50);

        BinaryNode<Integer> ten = new BinaryNode<Integer>(10);
        BinaryNode<Integer> ninety = new BinaryNode<Integer>(90);
        BinaryNode<Integer> five = new BinaryNode<Integer>(5);
        BinaryNode<Integer> thirty = new BinaryNode<Integer>(30);
        BinaryNode<Integer> seventy = new BinaryNode<Integer>(70);
        BinaryNode<Integer> ninetyFive = new BinaryNode<Integer>(95);

        root.setLeft(ten);
        root.setRight(ninety);

        ten.setLeft(five);
        ten.setRight(thirty);

        ninety.setLeft(seventy);
        ninety.setRight(ninetyFive);

        return root;
    }

    @Test
    public void testInvalidSearchTree() throws Exception {
        Assert.assertFalse(BinarySearchTreeChecker.isValid(invalidSearchTree));
    }

    @Test
    public void testValidSearchTree() throws Exception {
        Assert.assertTrue(BinarySearchTreeChecker.isValid(validSearchTree));

    }
}
