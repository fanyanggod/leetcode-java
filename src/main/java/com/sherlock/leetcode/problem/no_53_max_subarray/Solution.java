package com.sherlock.leetcode.problem.no_53_max_subarray;

/**
 * @author sherlock
 * @date 2022/2/9
 */
public class Solution {
  public int maxSubArray(int[] nums) {
    int pre = 0, result = nums[0];
    for (int x : nums) {
      pre = Math.max(pre + x, x);
      result = Math.max(result, pre);
    }
    return result;
  }
}
