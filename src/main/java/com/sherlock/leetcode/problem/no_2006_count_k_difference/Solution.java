package com.sherlock.leetcode.problem.no_2006_count_k_difference;

import java.util.HashMap;

/**
 * @author sherlock
 * @date 2022/2/9
 */
public class Solution {
    public int countKDifference(int[] nums, int k) {
        int result = 0;
        for (int i =0 ;i < nums.length;i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] - nums[j] == k || nums[j] - nums[i] == k) {
                    ++result;
                }
            }
        }
        return result;
    }
}
