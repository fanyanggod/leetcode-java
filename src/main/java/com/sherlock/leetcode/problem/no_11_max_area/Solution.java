package com.sherlock.leetcode.problem.no_11_max_area;

/**
 * @author sherlock
 *     <p>给定一个长度为 n 的整数数组 height 。有 n 条垂线，第 i 条线的两个端点是 (i, 0) 和 (i, height[i]) 。
 *     <p>找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 *     <p>返回容器可以储存的最大水量。
 *     <p>说明：你不能倾斜容器。
 *     <p>示例 1：
 *     <p>输入：[1,8,6,2,5,4,8,3,7] 输出：49 解释：图中垂直线代表输入数组
 *     [1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为 49。
 *     <p>示例 2：
 *     <p>输入：height = [1,1] 输出：1
 *     <p>提示：
 *     <p>n == height.length 2 <= n <= 10⁵ 0 <= height[i] <= 10⁴
 *     <p>Related Topics 贪心 数组 双指针 👍 3445 👎 0
 */
public class Solution {

  public int maxArea(int[] height) {
    int left = 0, right = height.length - 1;
    int result = Integer.MIN_VALUE;
    while (left < right) {
      if (height[left] <= height[right]) {
        result = Math.max(height[left] * (right - left), result);
        left++;
      } else {
        result = Math.max(height[right] * (right - left), result);
        right--;
      }
    }
    return result;
  }
}
