package com.algorithms;


import java.util.List;

public class Knapsack {

    public static class Item {
        private final int weight;
        private final int value;

        private Item(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }

        public static Item newInstance(int weight, int value) {
            return new Item(weight, value);
        }

        @Override
        public String toString() {
            return "Item{" +
                    "weight=" + weight +
                    ", value=" + value +
                    '}';
        }
    }

    public static int getBoundedMaxWeight(List<Item> items, int targetWeight) {
        int totalItems = items.size();
        int[][] prediction = new int[items.size() + 1][targetWeight + 1];

        for (int i = 0; i <= items.size(); i++) {
            for (int w = 0; w <= targetWeight; w++) {
                if (i == 0 || w == 0) {
                    prediction[i][w] = 0;
                } else if (items.get(i - 1).weight <= w) {
                    prediction[i][w] = Math.max(items.get(i - 1).value + prediction[i - 1][w - items.get(i - 1).weight], prediction[i - 1][w]);
                } else {
                    prediction[i][w] = prediction[i - 1][w];
                }
            }
        }

        return prediction[totalItems][targetWeight];
    }

    public static int getUnboundedMaxWeight(List<Item> items, int targetWeight) {
        int[] k = new int[targetWeight + 1];

        k[0] = 0;
        for (int w = 1; w <= targetWeight; w++) {
            int max = 0;

            for(int i = 0 ; i < items.size() ; i++){
                Item current = items.get(i);
                if(current.weight <= w){
                    int currentValue = k[w - items.get(i).weight] + current.value;
                    if(currentValue > max){
                        max = currentValue;
                    }
                }
            }

            k[w] = max;
        }

        return k[targetWeight];
    }
}
