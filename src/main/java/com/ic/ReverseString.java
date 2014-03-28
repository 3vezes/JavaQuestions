package com.ic;

/**
 * Write a function to reverse an array of characters in place.
 * "In place" means "without creating a new string in memory."
 */
public final class ReverseString {

    public static String reverseInPlace(String original){
        char[] originalArray = original.toCharArray();
        int length = originalArray.length -1;
        for(int i = 0 ; i < originalArray.length/2 ; i++){
            char temp = originalArray[i];

            //Swap with the end.
            originalArray[i] = originalArray[length - i];
            originalArray[length - i] = temp;
        }

        return String.valueOf(originalArray);
    }
}
