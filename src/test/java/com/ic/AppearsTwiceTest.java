package com.ic;

import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class AppearsTwiceTest {

    @Test
    public void testFindDuplicate() throws Exception {
        int target = 1000;
        List<Integer> listWithDuplicate = Lists.newArrayList();

        for(int i = 1 ; i <= target ; i++){
            listWithDuplicate.add(i);
        }

        int duplicate = 55;
        listWithDuplicate.add(duplicate);

        Assert.assertEquals(duplicate, AppearsTwice.findDuplicate(target, listWithDuplicate));
    }
}
