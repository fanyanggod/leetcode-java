package com.sherlock.leetcode.problem.no_26_remove_duplicates_from_sorted_array;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author sherlock
 * @date 2022/2/9
 */
@Slf4j
class SolutionTest {
  Solution solution = new Solution();

  @Test
  void removeDuplicates() {
    int result = solution.removeDuplicates(new int[] {1, 1, 2});
    log.info(String.valueOf(result));
  }
}
