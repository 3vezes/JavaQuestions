package com.cci;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RotateMatrixTest {

    private int[][] threeByThreeOriginal;
    private int[][] threeByThreeExpected;

    @Before
    public void setUp() throws Exception {
        threeByThreeOriginal = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        threeByThreeExpected = new int[][]{
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}
        };
    }

    @Test
    public void testRotateMatrix() throws Exception {
        Assert.assertArrayEquals(threeByThreeExpected,RotateMatrix.rotate(threeByThreeOriginal));
    }
}
