package test.java.com.cci;

import main.java.com.cci.TreeUtil;
import main.java.com.data.tree.BinaryNode;
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
        BinaryNode<Integer> fiveNode = new BinaryNode<>(5);
        BinaryNode<Integer> fourNode = new BinaryNode<>(null,fiveNode,4);
        BinaryNode<Integer> nineNode = new BinaryNode<>(9);
        BinaryNode<Integer> eightNode = new BinaryNode<>(fourNode,nineNode,8);
        BinaryNode<Integer> elevenNode = new BinaryNode<>(11);
        BinaryNode<Integer> twelveNode = new BinaryNode<>(elevenNode,null,12);
        return new BinaryNode<>(eightNode,twelveNode,10);
    }

    private BinaryNode<Integer> createBinaryTree() {
        BinaryNode<Integer> tenNode = new BinaryNode<>(10);
        BinaryNode<Integer> twelveNode = new BinaryNode<>(tenNode,null,12);
        BinaryNode<Integer> eightNode = new BinaryNode<>(8);
        BinaryNode<Integer> nineNode = new BinaryNode<>(eightNode,twelveNode,9);
        BinaryNode<Integer> elevenNode = new BinaryNode<>(11);
        BinaryNode<Integer> fourNode = new BinaryNode<>(elevenNode,null,4);
        return new BinaryNode<>(nineNode,fourNode,5);
    }

    @Test
    public void testIsBinarySearchTree(){
        Assert.assertTrue(TreeUtil.isBinarySearchTree(binarySearchTree));
        Assert.assertFalse(TreeUtil.isBinarySearchTree(binaryTree));
    }

}
