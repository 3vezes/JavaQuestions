package com.cci;

/**
 * You are given two 32-bit numbers, N and M, and two bit positions, i and j. Write a method to insert M into N
 * such that M starts at bit j and ends at bit i. You can assume that the bits j through i have enough space to fit
 * all of M. That is, if M = 10011, you can assume that there are at least 5 bits between j and i. You would not,
 * for example, have j = 3 and i = 2, because M could not fully fit between bit 3 and bit 2.
 * <p/>
 * Input N = 10000000000, M = 10011, i = 2, j = 6
 * Output N = 10001001100
 */
public final class BitwiseInsertion {

    public static int bitwiseInsert(int n, int m, int i, int j) {
        int shiftedM = m << i;

        //Build a mask representing 0s where m will be placed.
        int rightMask = ~0 << i;
        int leftMask = ~0 >>> (32 - j);

        //Use this make to clear the bits in n.
        int nWithBitCleared = n & (~rightMask | ~leftMask);

        return nWithBitCleared | shiftedM;
    }
}
