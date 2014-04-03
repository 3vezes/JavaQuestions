package com.ic;

import java.util.List;

/**
 * Write a function for finding the "rotation point,"
 * which is where I started working from the beginning of
 * the dictionary. This array is huge (there are lots of words
 * I don't know) so we want to be efficient here.
 */
public final class FindRotationPoint {

    /**
     * We're performing a modified binary search to find the index.
     * @param words
     * @return
     */
    public static int findRotationIndex(List<String> words){
        return recursiveSearch(words,0,words.size());
    }

    private static int recursiveSearch(List<String> words, int start, int end){
        //We have converged on the first dictionary entry.
        if(start + 1 == end){
            return end;
        }

        int range = end - start;

        int middleIndex = (range / 2) + start;

        String middle = words.get(middleIndex);
        String startWord = words.get(start);

        if(middle.compareToIgnoreCase(startWord) > 0){
            //Continue search the bottom half of the list.
            return recursiveSearch(words,middleIndex,end);
        } else {
            //The pivot must be in the top half.
            return recursiveSearch(words,start,middleIndex);
        }
    }
}
