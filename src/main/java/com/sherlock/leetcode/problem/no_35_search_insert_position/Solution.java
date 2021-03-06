package com.sherlock.leetcode.problem.no_35_search_insert_position;

/**
 * @author sherlock
 * @date 2022/2/9
 */
public class Solution {
  public int searchInsert(int[] nums, int target) {
    int start = 0, end = nums.length - 1;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (nums[mid] > target) {
        end = mid - 1;
      } else if (nums[mid] < target) {
        start = mid + 1;
      } else {
        return mid;
      }
    }
    return start;
  }
}
