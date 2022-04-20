package com.sherlock.leetcode.problem.no_26_remove_duplicates_from_sorted_array;

import java.util.Arrays;

/**
 * @author sherlock
 * @date 2022/2/9
 */
public class Solution {
  public int removeDuplicates(int[] nums) {
    if (nums.length < 2) {
      return nums.length;
    }
    int low = 1, fast = 1;
    while (fast < nums.length) {
      if (nums[fast] != nums[fast - 1]) {
        nums[low] = nums[fast];
        ++low;
      }
      ++fast;
    }
    return low;
  }
}
