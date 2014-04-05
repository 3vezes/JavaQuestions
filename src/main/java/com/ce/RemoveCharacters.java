package com.ce;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class RemoveCharacters {

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;
        while ((line = in.readLine()) != null) {
            String[] lineArray = line.split(",");
            if (lineArray.length > 0) {
                String original = lineArray[0];
                String replace = lineArray[1];
                removeCharacters(original, replace);
            }
        }
    }

    private static void removeCharacters(String original, String replaceList) {
        String result = original;
        for(char current : replaceList.toCharArray()){
            if(current != ' '){
                result = result.replaceAll(String.valueOf(current),"");
            }
        }

        System.out.println(result);
    }
}
