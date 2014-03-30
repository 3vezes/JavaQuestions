package com.ic;

import java.util.Collection;

/**
 * I have an array where every number in the range 1...n appears once except
 * for one number which appears twice. Write a function for finding the
 * number that appears twice.
 */
public final class AppearsTwice {

    public static int findDuplicate(int n, Collection<Integer> listWithDuplicate){
        //Sum the numbers for 1..n
        int sumWithoutDuplicates = 0;
        for(int i = 1 ; i <= n ; i++){
            sumWithoutDuplicates += i;
        }

        int sumWithDuplicates = 0;
        //Sum the collection that contains a duplicate.
        for (int current : listWithDuplicate){
            sumWithDuplicates += current;
        }

        //Return the difference.
        return sumWithDuplicates - sumWithoutDuplicates;
    }
}
