package com.cci;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

/**
 * Write an efficient function to find the first nonrepeated
 * character in a string.
 */
public class FirstNonRepeating {

    public static String find(String input){
        Multimap<Character,Integer> map = ArrayListMultimap.create();

        //Build the repeating instance map.
        for(char i : input.toCharArray()){
            map.put(i,0); //Doesn't matter what I insert. Just need to track the count.
        }

        for(char current : input.toCharArray()){
            if(map.get(current).size() == 1){
                return String.valueOf(current);
            }
        }

        throw new IllegalArgumentException("No characters are non-repeating.");
    }
}
