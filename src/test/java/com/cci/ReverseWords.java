package com.cci;

import com.google.common.base.Splitter;
import java.util.Stack;

public final class ReverseWords {

    public static String reverse(String original){
        Stack<String> stack = new Stack<String>();
        for(String word : Splitter.on(" ").split(original)){
            stack.push(word);
        }

        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()){
            stringBuilder.append(stack.pop());
            if(!stack.isEmpty()){
                stringBuilder.append(" ");
            }
        }

        return stringBuilder.toString();
    }
}
