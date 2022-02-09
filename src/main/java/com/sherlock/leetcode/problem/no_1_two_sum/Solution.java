package com.sherlock.leetcode.problem.no_1_two_sum;

import java.util.HashMap;

/**
 * @author sherlock
 * @date 2022/2/9
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int key = target - nums[i];
            if (map.containsKey(key) && i != map.get(key)) {
                return new int[]{Math.min(i,map.get(key)),Math.max(i,map.get(key))};
            }else {
                map.put(nums[i], i);
            }
        }
        return new int[2];
    }
}
