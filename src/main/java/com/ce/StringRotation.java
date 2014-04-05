package com.ce;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class StringRotation {

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;

        while ((line = in.readLine()) != null) {
            String[] lineArray = line.split(",");
            if (lineArray.length > 0) {
                String original = lineArray[0];
                String possibleRotation = lineArray[1];
                printIsStringRotation(original, possibleRotation);
            }
        }
    }

    private static void printIsStringRotation(String original, String possibleRotation) {
        System.out.println((possibleRotation + possibleRotation).contains(original)? "True" : "False");
    }
}
