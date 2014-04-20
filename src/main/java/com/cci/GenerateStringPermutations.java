package com.cci;

import com.google.common.collect.Lists;

import java.util.List;

public final class GenerateStringPermutations {

    public static List<String> permutations(String input) {
        char[] characters = input.toCharArray();
        List<Character> characterStack = Lists.newArrayList();
        for (char current : characters) {
            characterStack.add(current);
        }

        List<String> results = Lists.newArrayList();
        recursePermutations("", characterStack,results);
        return results;
    }

    public static void recursePermutations(String fixed, List<Character> remaining,List<String> results) {
        if(remaining.isEmpty()){
            results.add(fixed);
            return;
        }

        for(int i = 0 ; i < remaining.size() ; i++){
            List<Character> remainingCopy = Lists.newArrayList(remaining);
            remainingCopy.remove(i);
            String appended = fixed + remaining.get(i);
            recursePermutations(appended,remainingCopy,results);
        }
    }

}
