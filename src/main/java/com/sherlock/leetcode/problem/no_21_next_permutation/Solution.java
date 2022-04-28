package com.sherlock.leetcode.problem.no_21_next_permutation;

/**
 * @author sherlock
 */
public class Solution {
  public void nextPermutation(int[] nums) {
    int fast = nums.length - 2;
    while (fast >= 0 && nums[fast + 1] <= nums[fast]) {
      fast--;
    }
    if (fast >= 0) {
      int slow = nums.length - 1;
      while (slow >= 0 && nums[slow] <= nums[fast]) {
        slow--;
      }
      swap(nums,fast,slow);
    }
    reverse(nums,fast+1);
  }

  private void reverse(int[] nums, int start) {
    int i = start, j = nums.length - 1;
    while (i < j){
      swap(nums,i,j);
      i++;
      j--;
    }
  }

  private void swap(int[] nums, int fast, int slow) {
    int temp = nums[fast];
    nums[fast] = nums[slow];
    nums[slow] = temp;
  }
}
