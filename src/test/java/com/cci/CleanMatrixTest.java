package com.cci;

import org.junit.Assert;
import org.junit.Test;

public class CleanMatrixTest {

    @Test
    public void testCleanSimple() throws Exception {
        int[][] input = new int[][]{
                {0,1},
                {1,1},
                {2,2}
        };

        int[][] expected = new int[][]{
                {0,0},
                {0,1},
                {0,2}
        };

        Assert.assertArrayEquals(expected,CleanMatrix.clean(input));
    }

    @Test
    public void testCleanThreeByThree() throws Exception {
        int[][] input = new int[][]{
                {0,2,3},
                {1,0,3},
                {1,2,0}
        };

        int[][] expected = new int[][]{
                {0,0,0},
                {0,0,0},
                {0,0,0}
        };

        Assert.assertArrayEquals(expected,CleanMatrix.clean(input));
    }
}
