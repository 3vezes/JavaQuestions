package com.ic;

import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class CrawlerVisitedCacheTest {

    private List<String> sampleURLList = Lists.newArrayList("donut.net","dogood.org",
                                                            "dog.com","dog.com/about",
                                                            "dog.com/pug","dog.org",
                                                            "ericrgon.com","google.com");
    private CrawlerVisitedCache crawlerVisitedCache;

    @Before
    public void setUp() throws Exception {
        crawlerVisitedCache = new CrawlerVisitedCache();

        for(String current : sampleURLList){
            crawlerVisitedCache.addUrl(current);
        }
    }

    @Test
    public void testHasUrl() throws Exception {
        for(String current : sampleURLList){
            Assert.assertTrue(crawlerVisitedCache.hasUrl(current));
        }
    }

    @Test
    public void testDoesntHave() throws Exception {
        for(String current : sampleURLList){
            Assert.assertFalse(crawlerVisitedCache.hasUrl(current + current));
        }
    }
}
