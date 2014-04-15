package com.algorithms;

import com.google.common.collect.Lists;

import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * Implementation using Patience sorting.
 */
public class LongestIncreasingSequences {

    public static List<Integer> find(List<Integer> integers){
        List<Pile<Integer>> piles = Lists.newArrayList();

        int[] prediction = new int[integers.size()];

        //Create piles for each.
        for(int current : integers){
            Pile<Integer> newPile = new Pile<Integer>();
            newPile.push(current);

            int targetPile = Collections.binarySearch(piles,newPile);

            if(targetPile < 0){
                //Search was not successful but we have an ~ insertion point
                targetPile = ~targetPile;
            }

            if(targetPile != piles.size()){
                piles.get(targetPile).push(current);
            } else {
                piles.add(newPile);
                prediction[targetPile] = newPile.peek();
            }

            if(targetPile >= 1){
                prediction[targetPile -1] = piles.get(targetPile-1).peek();
            }


        }

        List<Integer> results = Lists.newArrayList();
        for(int current : prediction){
            if(current > 0){
                results.add(current);
            }
        }

        return results;
    }

    private static class Pile<E extends Comparable<E>> extends Stack<E> implements Comparable<Pile<E>>{

        @Override
        public int compareTo(Pile<E> o) {
            return this.peek().compareTo(o.peek());
        }
    }
}
