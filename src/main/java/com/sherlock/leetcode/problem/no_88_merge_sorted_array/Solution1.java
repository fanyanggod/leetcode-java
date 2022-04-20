package com.sherlock.leetcode.problem.no_88_merge_sorted_array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sherlock
 * @date 2022/2/10
 */
public class Solution1 {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int p1 = m - 1;
    int p2 = n - 1;
    int current = nums1.length - 1;
    while (p1 >= 0 || p2 >= 0) {
      if (p1 < 0) {
        nums1[current--] = nums2[p2--];
      } else if (p2 < 0) {
        nums1[current--] = nums1[p1--];
      } else if (nums1[p1] <= nums2[p2]) {
        nums1[current--] = nums2[p2--];
      } else {
        nums1[current--] = nums1[p1--];
      }
    }
  }
}
