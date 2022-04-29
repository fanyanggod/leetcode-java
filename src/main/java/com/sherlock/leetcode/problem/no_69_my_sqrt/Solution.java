package com.sherlock.leetcode.problem.no_69_my_sqrt;

import lombok.extern.slf4j.Slf4j;

/**
 * @author sherlock
 */
@Slf4j
public class Solution {
  public int mySqrt(int x) {
    if (x == 0) {
      return 0;
    }
    long result = x;
    while (x / result < result) {
      result = (result + x / result) / 2;
    }
    return (int)result;
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    log.info("{}",solution.mySqrt(0));
    log.info("{}",solution.mySqrt(1));
    log.info("{}",solution.mySqrt(2));
    log.info("{}",solution.mySqrt(3));
    log.info("{}",solution.mySqrt(4));
    log.info("{}",solution.mySqrt(5));
    log.info("{}",solution.mySqrt(8));
    log.info("{}",solution.mySqrt(16));
    log.info("{}",solution.mySqrt(2147395600));
    log.info("{}",solution.mySqrt(2147483647));
  }
}
