package com.ic;

import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class FindRotationPointTest {

    private List<String> words;
    private Random random = new Random(System.currentTimeMillis());

    @Before
    public void setUp() throws Exception {
        String wordsPath = getClass().getClassLoader().getResource("words").getPath();
        Path path = FileSystems.getDefault().getPath(wordsPath);
        List<String> rawWords = Files.readAllLines(path, Charset.forName("UTF-8"));
        words = Lists.newArrayList();
        for(String word : rawWords){
            words.add(word.toLowerCase());
        }
        Collections.sort(words);
    }

    @Test
    public void testFindRotationIndex() throws Exception {
        int rotationIndex = random.nextInt(words.size() -1);

        List<String> rotatedList = Lists.newArrayList(words.subList(rotationIndex,words.size()));
        rotatedList.addAll(words.subList(0,rotationIndex));

        Assert.assertEquals("a",rotatedList.get(FindRotationPoint.findRotationIndex(rotatedList)));
        Assert.assertEquals(words.size() - rotationIndex, FindRotationPoint.findRotationIndex(rotatedList));
    }
}
