package com.cci;

import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GenerateStringPermutationsTest {

    @Test
    public void testPermutations() throws Exception {
        List<String> expectedLists = Lists.newArrayList("abc", "acb",
                                                        "bac", "bca",
                                                        "cab","cba");
        Assert.assertEquals(GenerateStringPermutations.permutations("abc"), expectedLists);
    }
}
