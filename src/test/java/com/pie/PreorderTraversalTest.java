package com.pie;

import com.data.BinaryNode;
import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PreorderTraversalTest {

    private BinaryNode<Integer> root;

    @Before
    public void setUp() throws Exception {
        root = new BinaryNode<Integer>(100);

        BinaryNode<Integer> fifty = new BinaryNode<Integer>(50);
        BinaryNode<Integer> oneFifty = new BinaryNode<Integer>(150);

        root.setLeft(fifty);
        root.setRight(oneFifty);

        BinaryNode<Integer> twentyFive = new BinaryNode<Integer>(25);
        BinaryNode<Integer> seventyFive = new BinaryNode<Integer>(75);
        fifty.setLeft(twentyFive);
        fifty.setRight(seventyFive);

        BinaryNode<Integer> oneTwentyFive = new BinaryNode<Integer>(125);
        BinaryNode<Integer> oneSeventyFive = new BinaryNode<Integer>(175);
        oneFifty.setLeft(oneTwentyFive);
        oneFifty.setRight(oneSeventyFive);

        BinaryNode<Integer> oneTen = new BinaryNode<Integer>(110);
        oneTwentyFive.setLeft(oneTen);
    }

    @Test
    public void testPreorderTraversal() throws Exception {
        Assert.assertEquals(Lists.newArrayList(100,50,25,75,150,125,110,175),PreorderTraversal.traverse(root));

    }
}
