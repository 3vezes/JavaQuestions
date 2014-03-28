package com.ic;

/**
 * <p>
 * I have an array stockPricesYesterday where the keys are the number of minutes into
 * the day (starting with midnight) and the values are the price of
 * Apple stock at that time. For example,
 * the stock cost $500 at 1am, so stockPricesYesterday[60] = 500.
 * </p>
 * <p/>
 * <p>
 * Write an efficient algorithm for computing the best profit I could have made from 1 purchase and 1 sale of an Apple stock yesterday.
 * </p>
 */
public class StockTrading {

    public final static int MINUTES_IN_DAY = 1440;

    private final int[] historicalPrice;

    public StockTrading(int[] historicalPrice) {
        this.historicalPrice = historicalPrice;
    }

    public int computeBestProfit() {

        int currentMin = historicalPrice[0];
        int maxProfit = 0;

        for (int i = 0; i < historicalPrice.length; i++) {
            int currentPrice = historicalPrice[i];
            currentMin = Math.min(currentPrice, currentMin);
            maxProfit = Math.max(maxProfit, currentPrice - currentMin);
        }

        return maxProfit;
    }
}
