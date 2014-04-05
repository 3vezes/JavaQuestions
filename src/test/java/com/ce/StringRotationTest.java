package com.ce;

import org.junit.Test;

public class StringRotationTest {

    @Test
    public void testStringRotation() throws Exception {
        String filePath = getClass().getClassLoader().getResource("string_rotation_input").getFile();
        StringRotation.main(new String[]{filePath});
    }
}
