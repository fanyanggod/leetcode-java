package com.sherlock.leetcode.problem.no_905_sort_array_by_parity;

/**
 * @author sherlock
 *     <p>给你一个整数数组 nums，将 nums 中的的所有偶数元素移动到数组的前面，后跟所有奇数元素。
 *     <p>返回满足此条件的 任一数组 作为答案。
 *     <p>示例 1：
 *     <p>输入：nums = [3,1,2,4] 输出：[2,4,3,1] 解释：[4,2,3,1]、[2,4,1,3] 和 [4,2,1,3] 也会被视作正确答案。
 *     <p>示例 2：
 *     <p>输入：nums = [0] 输出：[0]
 *     <p>提示：
 *     <p>1 <= nums.length <= 5000 0 <= nums[i] <= 5000
 *     <p>Related Topics 数组 双指针 排序 👍 264 👎 0
 */
public class Solution {
  public int[] sortArrayByParity(int[] nums) {
    int left = 0, right = nums.length-1;
    while (left < right) {
      if (nums[left] % 2 != 0) {
        if (nums[right] % 2 == 0) {
          int temp = nums[left];
          nums[left] = nums[right];
          nums[right] = temp;
          left++;
          right--;
        }else {
          right--;
        }
      }else {
        left++;
      }
    }
    return nums;
  }
}
