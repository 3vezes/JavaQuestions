package com.ce;

import java.io.*;

public class FizzBuzz {

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;
        while ((line = in.readLine()) != null) {
            String[] lineArray = line.split("\\s");
            if (lineArray.length > 0) {
                int fizzDivisor = Integer.parseInt(lineArray[0]);
                int buzzDivisor = Integer.parseInt(lineArray[1]);
                int maxCount = Integer.parseInt(lineArray[2]);
                printFizzBuzz(fizzDivisor,buzzDivisor,maxCount);
            }
        }
    }

    private static void printFizzBuzz(int fizzDivisor, int buzzDivisor, int maxCount) {
        for(int i = 1 ; i <= maxCount ; i++){
            if(isDivisor(i,fizzDivisor) && isDivisor(i,buzzDivisor)){
                System.out.print("FB");
            } else if(isDivisor(i,buzzDivisor)){
                System.out.print("B");
            } else if(isDivisor(i,fizzDivisor)){
                System.out.print("F");
            } else {
                System.out.print(i);
            }

            if(i != maxCount){
                System.out.print(" ");
            }
        }

        System.out.println();
    }

    private static boolean isDivisor(int number, int divisor){
        return number % divisor == 0;
    }
}
