package com.sherlock.leetcode.problem.no_16_three_sum_closest;

import static org.junit.jupiter.api.Assertions.*;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * @author sherlock
 */
@Slf4j
class SolutionTest {

  @Test
  void threeSumClosest() {
    Solution solution = new Solution();
    log.info(String.valueOf(solution.threeSumClosest(new int[]{0,0,0},0)));
    log.info(String.valueOf(solution.threeSumClosest(new int[]{-1,2,1,-4},1)));
  }
}