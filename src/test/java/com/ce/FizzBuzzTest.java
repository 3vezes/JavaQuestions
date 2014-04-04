package com.ce;

import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void testFizzBuzz() throws Exception {
        String filePath = getClass().getClassLoader().getResource("fizz_buzz_input").getFile();
        FizzBuzz.main(new String[]{filePath});
    }
}
