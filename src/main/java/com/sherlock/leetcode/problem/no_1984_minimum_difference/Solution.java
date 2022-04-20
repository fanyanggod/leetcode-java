package com.sherlock.leetcode.problem.no_1984_minimum_difference;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author sherlock
 * @date 2022/2/11
 */
public class Solution {
  public int minimumDifference(int[] nums, int k) {
    int length = nums.length;
    int result = Integer.MAX_VALUE;
    Arrays.sort(nums);
    for (int i = 0; i + k - 1 < length; ++i) {
      result = Math.min(result, nums[i + k - 1] - nums[i]);
    }
    return result;
  }
}
