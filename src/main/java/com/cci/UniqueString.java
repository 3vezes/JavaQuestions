package com.cci;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * Implement an algorithm to determine if a string has all unique characters.
 */
public class UniqueString {

    public static boolean isUnique(String input) {
        Map<Character, Void> charMap = Maps.newHashMap();
        for (char current : input.toCharArray()) {
            if (charMap.containsKey(current)) {
                return false;
            } else {
                charMap.put(current, null);
            }
        }
        return true;
    }
}
