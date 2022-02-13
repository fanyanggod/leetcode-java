package com.sherlock.leetcode.problem.no_1189_max_number_of_ballboon;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author sherlock
 * @date 2022/2/13
 */
public class Solution {
    /*public int maxNumberOfBalloons(String text) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("b", 0);
        map.put("a", 0);
        map.put("l", 0);
        map.put("o", 0);
        map.put("n", 0);
        char[] testArr = text.toCharArray();
        int result = Integer.MAX_VALUE;
        for (char c : testArr) {
            if (map.containsKey(String.valueOf(c))) {
                map.put(String.valueOf(c), map.get(String.valueOf(c)) + 1);
            }
        }
        for (String key : map.keySet()) {
            result = Math.min(result, map.get(key));
        }

        if (result > 0) {
            result = Math.min(result,Math.min(map.get("l") / 2,map.get("o") / 2));
        }
        return result;

    }*/

    public int maxNumberOfBalloons(String text) {
        int[] cnt = new int[5];
        for (int i = 0; i < text.length(); ++i) {
            char ch = text.charAt(i);
            if (ch == 'b') {
                cnt[0]++;
            } else if (ch == 'a') {
                cnt[1]++;
            } else if (ch == 'l') {
                cnt[2]++;
            } else if (ch == 'o') {
                cnt[3]++;
            } else if (ch == 'n') {
                cnt[4]++;
            }
        }
        cnt[2] /= 2;
        cnt[3] /= 2;
        return Arrays.stream(cnt).min().getAsInt();
    }
}
