package com.cci;

import com.data.BinaryNode;
import com.data.LinkedListElement;
import com.google.common.collect.Sets;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Set;

public class BinaryTreeLevelsTest {


    private static final Set<Integer> expectedLevel0 = Sets.newHashSet(0);
    private static final Set<Integer> expectedLevel1 = Sets.newHashSet(2, 3);
    private static final Set<Integer> expectedLevel2 = Sets.newHashSet(4, 5, 6, 7);
    private static final Set<Integer> expectedLevel3 = Sets.newHashSet(8);
    private static final Set<Integer> expectedLevel4 = Sets.newHashSet(9);

    private BinaryNode<Integer> root;

    @Before
    public void setUp() throws Exception {
        root = new BinaryNode<Integer>(0);
        BinaryNode<Integer> one = new BinaryNode<Integer>(1);
        BinaryNode<Integer> two = new BinaryNode<Integer>(2);
        BinaryNode<Integer> three = new BinaryNode<Integer>(3);
        BinaryNode<Integer> four = new BinaryNode<Integer>(4);
        BinaryNode<Integer> five = new BinaryNode<Integer>(5);
        BinaryNode<Integer> six = new BinaryNode<Integer>(6);
        BinaryNode<Integer> seven = new BinaryNode<Integer>(7);
        BinaryNode<Integer> eight = new BinaryNode<Integer>(8);
        BinaryNode<Integer> nine = new BinaryNode<Integer>(9);

        root.setLeft(two);
        root.setRight(three);

        two.setLeft(four);
        two.setRight(five);

        three.setLeft(six);
        three.setRight(seven);

        five.setLeft(eight);

        eight.setRight(nine);
    }

    @Test
    public void testBinaryTree() throws Exception {
        List<LinkedListElement<Integer>> results = BinaryTreeLevels.getLevels(root);

        Assert.assertEquals(4, results.size() - 1);

        //Ensure the contents are correct;
        Assert.assertEquals(expectedLevel0, getAllitems(results.get(0)));
        Assert.assertEquals(expectedLevel1, getAllitems(results.get(1)));
        Assert.assertEquals(expectedLevel2, getAllitems(results.get(2)));
        Assert.assertEquals(expectedLevel3, getAllitems(results.get(3)));
        Assert.assertEquals(expectedLevel4, getAllitems(results.get(4)));
    }

    private static Set<Integer> getAllitems(LinkedListElement<Integer> head) {
        Set<Integer> results = Sets.newHashSet();
        LinkedListElement<Integer> current = head;
        while (current != null) {
            results.add(current.getData());
            current = current.getNext();
        }

        return results;
    }
}