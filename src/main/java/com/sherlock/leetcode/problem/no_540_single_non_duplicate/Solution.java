package com.sherlock.leetcode.problem.no_540_single_non_duplicate;

/**
 * @author sherlock
 * @date 2022/2/14
 */
public class Solution {
    public int singleNonDuplicate(int[] nums) {
       int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = (high - low) / 2 + low;
            mid -= mid & 1;
            if (nums[mid] == nums[mid + 1]) {
                low = mid + 2;
            } else {
                high = mid;
            }
        }
        return nums[low];
    }
}
