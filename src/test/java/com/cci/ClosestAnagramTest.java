package com.cci;


import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class ClosestAnagramTest {

    private List<String> unsortedAnagrams;
    private List<String> sortedAnagrams;

    @Before
    public void setUp() throws Exception {
        unsortedAnagrams = Lists.newArrayList("glare","caret","resin",
                "pare","mate","least",
                "leapt","leap","lascar",
                "lament","lager","mantel",
                "rascal","pale","slate",
                "meat","pear","rinse",
                "carte");

        sortedAnagrams = Lists.newArrayList("lascar", "rascal", "caret",
                "carte", "glare", "lager",
                "lament", "mantel", "leap",
                "pale", "leapt", "least",
                "slate", "mate", "meat",
                "pare", "pear", "resin",
                "rinse");
    }

    @Test
    public void testAnagramSort() throws Exception {
        Assert.assertEquals(sortedAnagrams,ClosestAnagram.sort(unsortedAnagrams));
    }
}
