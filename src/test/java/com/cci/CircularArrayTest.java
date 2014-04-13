package com.cci;

import com.google.common.collect.ImmutableList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CircularArrayTest {

    private CircularArray<Integer> circularArray;
    private static final ImmutableList<Integer> EXPECTED_LIST_ORDER = ImmutableList.of(
            5,6,7,8,9,0,1,2,3,4);

    @Before
    public void setUp() throws Exception {
        circularArray = new CircularArray<Integer>();
        for(int i = 0 ; i < 10 ; i++){
            circularArray.add(i);
        }

        circularArray.setRotationPoint(5);
    }

    @Test
    public void testCircularArray() throws Exception {
        int counter = 0;
        for(Integer i : circularArray){
            Assert.assertEquals(EXPECTED_LIST_ORDER.get(counter),i);
            counter++;
        }
    }

    @Test
    public void testGets() throws Exception {
        for(int i = 0 ; i < 10 ; i++){
            Assert.assertEquals(EXPECTED_LIST_ORDER.get(i),circularArray.get(i));
        }
    }
}
