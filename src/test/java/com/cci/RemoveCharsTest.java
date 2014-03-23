package com.cci;


import org.junit.Assert;
import org.junit.Test;

public class RemoveCharsTest {

    public static final String SAMPLE = "Battle of the Vowels: Hawaii vs. Grozny";

    @Test
    public void testRemove() throws Exception {
        Assert.assertEquals("Bttl f th Vwls: Hw vs. Grzny",RemoveChars.remove(SAMPLE,"aeiou"));
    }
}
