package com.ce;

import org.junit.Test;

public class LongestLinesTest {

    @Test
    public void testLongestLines() throws Exception {
        String filePath = getClass().getClassLoader().getResource("longest_lines").getFile();
        LongestLines.main(new String[]{filePath});
    }
}
