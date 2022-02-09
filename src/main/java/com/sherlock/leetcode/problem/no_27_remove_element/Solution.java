package com.sherlock.leetcode.problem.no_27_remove_element;

import java.util.Arrays;

/**
 * @author sherlock
 * @date 2022/2/9
 */
public class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        int left = 0, right = nums.length-1;
        while (left <= right) {
            if (nums[left] == val && nums[right] != val) {
                nums[left] = nums[right];
                nums[right] = val;
                ++left;
                --right;
            }
            if (nums[right] == val) {
                --right;
            }
            if (nums[left] != val) {
                ++left;
            }
        }
        return left;
    }
}
