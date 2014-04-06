package com.cci;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import java.util.List;
import java.util.Set;

/**
 * Implement an algorithm to print all valid combinations of n-pars of
 * parentheses.
 */
public final class ParenthesesCombinations {

    public static Set<String> generate(int nPairs) {
        Set<String> results = Sets.newHashSet();
        generateRecursive(nPairs, "", results);
        return results;
    }

    public static Set<String> generate2(int nPairs) {
        List<String> results = Lists.newArrayList();
        generateRecursive2(nPairs, nPairs, "", results);
        return Sets.newHashSet(results);
    }

    public static void generateRecursive(int index, String current, Set<String> results) {
        if (index == 0) {
            results.add(current);
        } else {
            generateRecursive(index - 1, current + "()", results);
            generateRecursive(index - 1, "()" + current, results);
            generateRecursive(index - 1, "(" + current + ")", results);
        }
    }

    public static void generateRecursive2(int leftRemaining, int rightRemaining, String current, List<String> results) {
        if (leftRemaining == 0 && rightRemaining == 0) {
            //We're out of options.
            results.add(current);
            return;
        }

        if (rightRemaining > leftRemaining) {
            generateRecursive2(leftRemaining, rightRemaining -1, current + ")", results);
        }

        if (leftRemaining > 0) {
            generateRecursive2(leftRemaining -1 , rightRemaining, current + "(", results);
        }
    }
}
