package com.sherlock.leetcode.problem.no_2006_count_k_difference;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author sherlock
 * @date 2022/2/9
 */
@Slf4j
class SolutionTest {
  Solution solution = new Solution();

  @Test
  void countKDifference() {
    int result = solution.countKDifference(new int[] {3, 2, 1, 5, 4}, 2);
    Assert.isTrue(result == 3, "Error result:" + result);
  }
}
