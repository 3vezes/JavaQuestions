package com.ic;


import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class StockTradingTest {

    @Test
    public void testTrade() throws Exception {

        int[] randomData = generateRandomData();
        randomData[0] = 0;

        //No value from random will be above 200.
        randomData[StockTrading.MINUTES_IN_DAY - 1] = 500;

        StockTrading stockTrading = new StockTrading(randomData);
        Assert.assertEquals(500, stockTrading.computeBestProfit());
    }

    private int[] generateRandomData() {
        Random random = new Random(System.currentTimeMillis());
        int[] testData = new int[StockTrading.MINUTES_IN_DAY];
        for (int i = 0; i < StockTrading.MINUTES_IN_DAY; i++) {
            testData[i] = random.nextInt(200);
        }
        return testData;
    }
}
