package com.cci;

import org.junit.Assert;
import org.junit.Test;

public class BitwiseInsertionTest {

    @Test
    public void testInsertion() throws Exception {
        Assert.assertEquals(0b10001001100, BitwiseInsertion.bitwiseInsert(0b10000000000, 0b10011, 2, 6));
        Assert.assertEquals(0b10001001100, BitwiseInsertion.bitwiseInsert(0b10001111100, 0b10011, 2, 6));
    }
}