package com.cci;

import com.google.common.collect.Sets;

import java.util.Set;

/**
 * Write an algorithm such that if an element is an MxN matrix is 0, it's entire row and
 * column are set to 0.
 */
public final class CleanMatrix {

    public static int[][] clean(int[][] matrix){
        Set<Integer> rowSet = Sets.newHashSet();
        Set<Integer> columnSet = Sets.newHashSet();

        int rowLength = matrix.length;
        int columnLength = matrix[0].length;

        for(int row = 0; row < rowLength ; row++){
            for (int column = 0; column < columnLength ; column++){
                if(matrix[row][column] == 0){
                    rowSet.add(row);
                    columnSet.add(column);
                }
            }
        }

        for(int row = 0 ; row < rowLength ; row++){
            for(int column = 0; column < columnLength ; column++){
                if(rowSet.contains(row) || columnSet.contains(column)){
                    matrix[row][column] = 0;
                }
            }
        }

        return matrix;
    }
}
