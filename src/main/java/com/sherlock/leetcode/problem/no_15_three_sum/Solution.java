package com.sherlock.leetcode.problem.no_15_three_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author sherlock
 */
public class Solution {
  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    if (nums.length < 3) {
      return result;
    }
    Arrays.sort(nums);

    for (int i = 0; i < nums.length - 2; i++) {
      if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
      }
      int left = i + 1;
      int right = nums.length - 1;

      while (left < right) {
        if (nums[left] + nums[right] + nums[i] == 0) {
          result.add(Arrays.asList(nums[i], nums[left], nums[right]));
          right--;
          left++;
          while (left < right && nums[left] == nums[left -1]) {
            left++;
          }
          while (left < right && nums[right] == nums[right +1]) {
            right--;
          }
        } else if (nums[left] + nums[right] + nums[i] < 0) {
          left++;
        }else {
          right--;
        }
      }
    }
    return result;
  }

}