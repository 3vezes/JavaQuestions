package com.ce;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Write a program to read a multiple line text file and write the 'N' longest
 * lines to stdout. Where the file to be read is specified on the command line.
 */
public class LongestLines {

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;

        int outputNumber = Integer.parseInt(in.readLine());
        List<String> lines = new ArrayList<String>();

        while ((line = in.readLine()) != null) {
            lines.add(line);
        }

        printLongestLines(outputNumber,lines);
    }

    private static void printLongestLines(int outputNumber, Collection<String> lines) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<String>(lines.size(),new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()){
                    return 0;
                } else if(o1.length() < o2.length()){
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        priorityQueue.addAll(lines);

        for(int i = 0 ; i < outputNumber ; i++){
            System.out.println(priorityQueue.remove());
        }
    }
}
