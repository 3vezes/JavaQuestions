package com.ic;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

/**
 * Write an efficient function that checks whether any permutation of an input
 * string is a palindrome (a string that is the same when read
 * forwards and backwards).
 */
public class PermutationPalindrome {

    public static boolean isValid(String input){
        Multiset<Character> characterMultiset = HashMultiset.create();
        String removedWhiteSpaceInput = input.replaceAll(" ","");
        for(char current : removedWhiteSpaceInput.toCharArray()){
            if(characterMultiset.contains(current)){
                characterMultiset.remove(current);
            } else {
                characterMultiset.add(current);
            }
        }

        if(removedWhiteSpaceInput.length() % 2 == 0){
            return characterMultiset.isEmpty();
        } else {
            //Pivot is a single character.
            return characterMultiset.size() == 1;
        }
    }
}
