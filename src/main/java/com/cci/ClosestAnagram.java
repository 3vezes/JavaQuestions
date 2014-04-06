package com.cci;

import com.google.common.collect.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Write a method to sort an array of strings so that all the anagrams are next
 * to each other.
 */
public final class ClosestAnagram {

    public static List<String> sort(Collection<String> unsortCollection){
        SortedSetMultimap<String,String> anagramMap = TreeMultimap.create();

        for(String current : unsortCollection){
            //Sort the key before loading in the map.
            anagramMap.put(sortString(current),current);
        }

        List<String> results = Lists.newArrayList();

        //Dump the maps into a list.
        List<String> sortedKeys = Lists.newArrayList(anagramMap.keySet());

        //The problem doesn't request sorted keys but we're doing so for the unit tests.
        Collections.sort(sortedKeys);
        for(String current :sortedKeys){
            results.addAll(anagramMap.get(current));
        }

        return results;
    }

    private static String sortString(String current) {
        char[] chars = current.toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars);
    }
}
