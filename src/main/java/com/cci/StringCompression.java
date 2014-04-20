package com.cci;

/**
 * Implement a method to perform basic string compression using the counts of
 * repeated characters. For example, the string aabccccaaa would become a2b1c5a3.
 * If the "compressed" string would not become smaller than the original string,
 * your method should return the original string.
 */
public final class StringCompression {

    public static String compress(String input){
        if(input.isEmpty()){
            return "";
        }

        StringBuilder result = new StringBuilder();
        char[] allChars = input.toCharArray();
        char previous = allChars[0];
        int count = 1;

        for(int i = 1; i < allChars.length ; i++){
            if(allChars[i] == previous){
                count++;
            } else {
                result.append(previous).append(count);
                count = 1;
                previous = allChars[i];
            }
        }

        result.append(previous).append(count);

        return input.length() < result.length() ? input : result.toString();
    }
}
