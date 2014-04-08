package com.cci;

import com.google.common.collect.Lists;

import java.util.Collections;
import java.util.List;

/**
 * A magic index in an array A[1...n-1] is defined to be an index such that A[i] = i.
 * Given a sorted array of distinct integers, write a method to find a magic index, if one
 * exists, in array A.
 *
 * Follow up
 *  What if the values are not distinct.
 */
public final class MagicIndex {

    /**
     * Use a modified binary search to discover the index.
     * @param items
     * @return
     */
    public static int find(List<Integer> items){
        List<Integer> sortedItems = Lists.newArrayList(items);
        Collections.sort(sortedItems);
        return recursiveBinarySearch(sortedItems,0,sortedItems.size()-1);
    }

    private static int recursiveBinarySearch(List<Integer> sortedItems,int start,int end) {
        int middleIndex = (end + start)/2;
        int middleValue = sortedItems.get(middleIndex);

        if(middleValue > middleIndex){
            //It's impossible for a valid item to exist at this point.
            throw new IllegalArgumentException("No magic here.");
        }

        //Found the magic.
        if(middleIndex == middleValue){
            return middleIndex;
        } else if(middleIndex > middleValue) {
            //Go right.
            return recursiveBinarySearch(sortedItems,middleIndex + 1,end);
        } else {
            //Go left.
            return recursiveBinarySearch(sortedItems,start,middleIndex -1);
        }
    }


}
