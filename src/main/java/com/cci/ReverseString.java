package com.cci;

/**
 * Implement a method which reversed a string
 */
public final class ReverseString {

    public static String reverse(String original) {
        char[] reversed = original.toCharArray();
        int endIndex = original.length() - 1;
        for (int i = 0; i < original.length() / 2; i++) {
            char temp = reversed[endIndex];
            reversed[endIndex] = reversed[i];
            reversed[i] = temp;
            endIndex--;
        }

        return String.valueOf(reversed);
    }
}
