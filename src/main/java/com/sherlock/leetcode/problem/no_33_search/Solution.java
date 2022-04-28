package com.sherlock.leetcode.problem.no_33_search;

import lombok.extern.slf4j.Slf4j;

/**
 * @author sherlock
 */
@Slf4j
public class Solution {
  public int search(int[] nums, int target) {
    int median = 0;
    for (int i = 1; i < nums.length-1; i++) {
      if (nums[i - 1] > nums[i + 1]) {
        median = i;
      }
    }
    if (target == nums[median]) {
      return median;
    }else if (target <= nums[nums.length-1]) {
      return search(nums, target, median + 1, nums.length - 1);
    } else {
      return search(nums, target, 0, median -1);
    }
  }

  private int search(int[] nums, int target, int left, int right) {
    if (left > right) {
      return -1;
    }
    int median = (left + right) >>> 1;
    if (target == nums[median]) {
      return median;
    } else if (target < nums[median]) {
      return search(nums, target, left, median - 1);
    }else {
      return search(nums, target, median + 1, right);
    }
  }

  public static void main(String[] args) {
    log.info(String.valueOf(new Solution().search(new int[]{5,1,3},5)));
    log.info(String.valueOf(new Solution().search(new int[]{1,3,5},5)));
    log.info(String.valueOf(new Solution().search(new int[]{1,3,5},5)));
    log.info(String.valueOf(new Solution().search(new int[]{1,3},1)));
    log.info(String.valueOf(new Solution().search(new int[]{1,3},3)));
    log.info(String.valueOf(new Solution().search(new int[]{1,3},5)));
    log.info(String.valueOf(new Solution().search(new int[]{3,1},1)));
    log.info(String.valueOf(new Solution().search(new int[]{3,1},3)));
    log.info(String.valueOf(new Solution().search(new int[]{3,1},5)));
  }
}
