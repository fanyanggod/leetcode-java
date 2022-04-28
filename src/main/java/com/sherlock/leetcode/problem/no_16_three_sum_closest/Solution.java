package com.sherlock.leetcode.problem.no_16_three_sum_closest;

import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;

/**
 * @author sherlock
 */
@Slf4j
public class Solution {
  public int threeSumClosest(int[] nums, int target) {
    int result = Integer.MAX_VALUE;
    int differ = Integer.MAX_VALUE;
    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 2; i++) {
      int left = i + 1;
      int right = nums.length - 1;

      while (left < right) {
        int current = nums[i] + nums[left] + nums[right];
        if (current  == target){
          result = target;
          break;
        } else if (current < target) {
          if (target - current < differ) {
            differ = target - current;
            result = current;
          }
          left++;
        }else {
          if (current - target < differ) {
            differ = current - target;
            result = current;
          }
          right--;
        }
      }
      if (result == target) {
        break;
      }
    }
    return result;
  }
}
