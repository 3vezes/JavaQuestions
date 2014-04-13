package com.cci;

import com.data.BinaryNode;
import com.google.common.collect.ContiguousSet;
import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.Lists;
import com.google.common.collect.Range;
import com.google.common.math.IntMath;
import com.pie.TreeHeight;
import org.junit.Assert;
import org.junit.Test;

import java.math.RoundingMode;
import java.util.List;

public class MinHeightBinaryTreeTest {

    @Test
    public void testCreateBalanced() throws Exception {
        for(int i = 0 ; i < 12 ; i++){
            int targetTreeSize = (int) Math.pow(2,i);
            int expectedHeight = IntMath.log2(targetTreeSize, RoundingMode.UP) + 1;

            Range<Integer> range = Range.openClosed(0,targetTreeSize);
            List<Integer> sortedList = Lists.newArrayList(ContiguousSet.create(range, DiscreteDomain.integers()));
            BinaryNode<Integer> root = MinHeightBinaryTree.createBalanced(sortedList);
            Assert.assertEquals(expectedHeight, TreeHeight.findHeight(root));
        }
    }
}
