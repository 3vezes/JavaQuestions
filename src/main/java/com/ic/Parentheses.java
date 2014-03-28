package com.ic;

import com.google.common.base.Preconditions;

/**
 * Write a function that, given a sentence like the above,
 * along with the position of an opening parenthesis,
 * finds the corresponding closing parenthesis.
 */
public final class Parentheses {

    public static int findClosing(String input, int indexOfFirst){
        int currentIndex = indexOfFirst + 1;
        int count = 1;

        //Validate index is a (
        Preconditions.checkArgument(input.charAt(indexOfFirst) == '(', "Index provided is not a (");

        //Check we're not given an index at the end of the string.
        Preconditions.checkArgument(indexOfFirst != input.length() -1,"Cannot find closing ) for last element.");

        while (count != 0 && currentIndex < input.length()){
            if(input.charAt(currentIndex) == ')'){
                count--;
            } else if(input.charAt(currentIndex) == '('){
                count++;
            }

            //Don't increment the index if the solution has been found.
            if(count != 0){
                currentIndex++;
            }
        }

        return count > 0 ? -1 : currentIndex;
    }
}
