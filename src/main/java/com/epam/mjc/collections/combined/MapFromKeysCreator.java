package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        HashMap<Integer, Set<String>> result = new HashMap<>();

        sourceMap.forEach((key, val) -> {
            if (!result.containsKey(key.length())) {
                result.put(key.length(), new HashSet<>());
            }

            result.get(key.length()).add(key);
        });

        return result;
    }
}
