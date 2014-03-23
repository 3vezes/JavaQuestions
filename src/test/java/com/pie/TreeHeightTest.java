package com.pie;

import com.data.BinaryNode;
import org.junit.Assert;
import org.junit.Test;


public class TreeHeightTest {

    @Test
    public void testFindHeight() throws Exception {
        BinaryNode<Integer> root = new BinaryNode<Integer>(0);

        Assert.assertEquals(1,TreeHeight.findHeight(root));

        BinaryNode<Integer> level2Left = new BinaryNode<Integer>(2);
        root.setLeft(level2Left);

        Assert.assertEquals(2, TreeHeight.findHeight(root));

        BinaryNode<Integer> level2Right = new BinaryNode<Integer>(3);
        root.setRight(level2Right);

        //Shouldn't modify the height.
        Assert.assertEquals(2, TreeHeight.findHeight(root));

        BinaryNode<Integer> level3Left = new BinaryNode<Integer>(4);
        level2Right.setLeft(level3Left);

        Assert.assertEquals(3, TreeHeight.findHeight(root));
    }
}
