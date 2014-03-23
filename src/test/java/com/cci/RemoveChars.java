package com.cci;


import com.google.common.collect.Maps;

import java.util.Map;

public final class RemoveChars {

    public static String remove(String original, String remove){
        //Build a map of the remove chars.
        Map<Character,Void> removeMap = Maps.newHashMap();
        for(char value : remove.toCharArray()){
            removeMap.put(value,null);
        }

        //Iterate through the original checking remove map. Append to StringBuilder.
        StringBuilder stringBuilder = new StringBuilder();
        for(char current : original.toCharArray()){
            if(!removeMap.containsKey(current)){
                stringBuilder.append(current);
            }
        }

        return stringBuilder.toString();
    }
}
