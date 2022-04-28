package com.sherlock.leetcode.problem.no_15_three_sum;

import static org.junit.jupiter.api.Assertions.*;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * @author sherlock
 */
@Slf4j
class SolutionTest {
  Solution solution = new Solution();

  @Test
  void threeSum() {
    log.info(solution.threeSum(new int[]{-1,0,1,2,-1,-4}).toString());
    log.info(solution.threeSum(new int[]{0,0,0,0}).toString());
  }
}