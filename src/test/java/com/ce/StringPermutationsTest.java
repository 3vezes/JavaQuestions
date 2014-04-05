package com.ce;


import org.junit.Test;

public class StringPermutationsTest {

    @Test
    public void testStringPermutations() throws Exception {
        String filePath = getClass().getClassLoader().getResource("string_permutations_input").getFile();
        StringPermutations.main(new String[]{filePath});
    }
}
