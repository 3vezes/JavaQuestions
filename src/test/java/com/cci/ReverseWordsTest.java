package com.cci;

import org.junit.Assert;
import org.junit.Test;

public class ReverseWordsTest {

    @Test
    public void testReverseWords() throws Exception {
        Assert.assertEquals("try. no is there not, do or Do",
                ReverseWords.reverse("Do or do not, there is no try."));
    }
}
