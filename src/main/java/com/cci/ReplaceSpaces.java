package com.cci;

/**
 * Write a method to replace all spaces in a string with %20
 */
public final class ReplaceSpaces {

    public static String replace(String input) {
        StringBuilder sb = new StringBuilder();
        for (char current : input.toCharArray()) {
            if (' ' == current) {
                sb.append("%20");
            } else {
                sb.append(current);
            }
        }
        return sb.toString();
    }
}
