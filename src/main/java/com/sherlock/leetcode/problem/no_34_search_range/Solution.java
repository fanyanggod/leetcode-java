package com.sherlock.leetcode.problem.no_34_search_range;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

/**
 * @author sherlock
 */
@Slf4j
public class Solution {
  public int[] searchRange(int[] nums, int target) {
    int[] result = new int[] {-1, -1};
    if (nums.length == 0) {
      return result;
    }
    int media = (nums.length - 1) >>> 1;
    int flag = 0;
    if (target == nums[media]) {
      flag = media;
    } else if (target < nums[media]) {
      flag = search(nums, target, 0, media - 1);
    }else {
      flag = search(nums, target, media + 1, nums.length - 1);
    }
    if (flag > -1) {
      result[0] = flag;
      result[1] = flag;
      for (int i = flag; i >= 0; i--) {
        if (target == nums[i]) {
          result[0] = Math.min(i,flag);
        }
        if (target > nums[i]) {
          break;
        }
      }
      for (int j = flag; j < nums.length; j++) {
        if (target == nums[j]) {
          result[1] = j;
        }
        if (target < nums[j]) {
          break;
        }
      }
    }
    return result;
  }

  private int search(int[] nums, int target, int left, int right) {
    if (left > right) {
      return -1;
    }

    int media = (right + left) >>> 1;
    int compare = target - nums[media];
    if (compare == 0) {
      return media;
    } else if (compare < 0) {
      return search(nums, target, left, media - 1);
    }else {
      return search(nums, target, media + 1, right);
    }
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    log.info(Arrays.toString(solution.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)));
    log.info(Arrays.toString(solution.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6)));
    log.info(Arrays.toString(solution.searchRange(new int[]{}, 6)));
  }
}
