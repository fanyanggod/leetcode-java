package com.sherlock.leetcode.problem.no_1447_simplified_fractions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author sherlock
 * @date 2022/2/10
 */
public class Solution {
    public List<String> simplifiedFractions(int n) {
        List<String> result = new ArrayList<>();
        Set<Double> set = new HashSet<>();
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                if (j / i < 1 ) {
                    if (j == 1) {
                        result.add(j + "/" + i);
                        set.add(i*1.0 / j);
                    } else if (!set.contains(i*1.0/j)) {
                        result.add(j + "/" + i);
                        set.add(i*1.0 / j);
                    }
                }
            }
        }
        return result;
    }
}
