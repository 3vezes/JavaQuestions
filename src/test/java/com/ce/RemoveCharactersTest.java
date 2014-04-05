package com.ce;

import org.junit.Test;

public class RemoveCharactersTest {

    @Test
    public void testRemoveChars() throws Exception {
        String filePath = getClass().getClassLoader().getResource("remove_chars_input").getFile();
        RemoveCharacters.main(new String[]{filePath});

    }
}
