package com.ce;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StringPermutations {

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;

        List<String> lines = new ArrayList<String>();

        while ((line = in.readLine()) != null) {
            lines.add(line);
        }

        for (String current : lines) {
            List<String> permutations = permutations(current);
            for (int i = 0; i < permutations.size(); i++) {
                System.out.print(permutations.get(i));

                if (i != permutations.size() - 1) {
                    System.out.print(",");
                }
            }
            System.out.println();
        }

    }

    public static List<String> permutations(String input) {
        char[] characters = input.toCharArray();
        List<Character> characterStack = new ArrayList();
        for (char current : characters) {
            characterStack.add(current);
        }

        List<String> results = new ArrayList();
        recursePermutations("", characterStack, results);
        return results;
    }

    public static void recursePermutations(String fixed, List<Character> remaining, List<String> results) {
        if (remaining.isEmpty()) {
            results.add(fixed);
            return;
        }

        for (int i = 0; i < remaining.size(); i++) {
            List<Character> remainingCopy = new ArrayList(remaining);
            remainingCopy.remove(i);
            String appended = fixed + remaining.get(i);
            recursePermutations(appended, remainingCopy, results);
        }
    }
}
