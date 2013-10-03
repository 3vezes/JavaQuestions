package com.cci;

import com.google.common.base.Preconditions;

/**
 * When given a number maps it to an alpha spreadsheet column.
 *
 * Example: 0 -> A, 1 -> B, 26 -> AA, 27 -> AB,...
 *
 */
public class SpreadSheetColumns {

    private static final char A = 'A';

    public static String convertToColumn(int i){
        Preconditions.checkArgument(i >= 0,"The number given must be positive.");

        if(i / 26 > 0){
            return convertToColumn((i/26) - 1) + convert(i % 26);
        }
        else {
            return convert(i % 26);
        }
    }

    private static String convert(int i){
        return String.valueOf((char) (A + i));
    }
}
