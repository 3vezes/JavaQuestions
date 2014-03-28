package com.ic;

import com.google.common.collect.Maps;

import java.util.Map;
import java.util.Stack;

public final class BracketValidator {

    private static final Map<Character,Character> bracketMap = Maps.newHashMap();
    static {
        bracketMap.put('(',')');
        bracketMap.put('{','}');
        bracketMap.put('[',']');
    }

    public static boolean validate(String input){
        Stack<Character> stack = new Stack<Character>();

        for(char current : input.toCharArray()){
            if(bracketMap.containsKey(current)){
                //Matches opening brace.
                stack.push(current);
            } else if(bracketMap.containsValue(current) && bracketMap.get(stack.peek()) == current){
                //We have a closing brace and it matches the value in the stack.
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
