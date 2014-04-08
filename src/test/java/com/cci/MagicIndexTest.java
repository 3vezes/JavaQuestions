package com.cci;

import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class MagicIndexTest {

    private static final int MAGIC_INDEX = 4;

    private List<Integer> magicList = Lists.newArrayList(-4, -3, 0, 1, 4);
    private List<Integer> noMagicList = Lists.newArrayList(-10, -5, -2, 5, 7, 10);
    private List<Integer> noMagicList2 = Lists.newArrayList(1);

    @Test
    public void testFindMagic() throws Exception {
        Assert.assertEquals(MAGIC_INDEX, MagicIndex.find(magicList));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNoMagic() throws Exception {
        MagicIndex.find(noMagicList);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNoMagic2() throws Exception {
        MagicIndex.find(noMagicList2);
    }
}
