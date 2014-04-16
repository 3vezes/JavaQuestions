package com.algorithms;


import com.google.common.collect.Maps;

import java.util.Map;

public final class DynamicFib {

    public static int fib(int position) {
        Map<Integer, Integer> cacheMap = Maps.newHashMap();

        if (position < 2) {
            return position;
        }

        cacheMap.put(0, 0);
        cacheMap.put(1, 1);

        return fibRecursive(cacheMap, position);
    }

    private static int fibRecursive(Map<Integer, Integer> cache, int position) {
        if (cache.containsKey(position)) {
            return cache.get(position);
        }

        return fibRecursive(cache, position - 1) + fibRecursive(cache, position - 2);
    }

}
