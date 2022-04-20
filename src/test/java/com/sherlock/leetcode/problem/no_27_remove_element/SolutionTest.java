package com.sherlock.leetcode.problem.no_27_remove_element;

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
  void removeElement() {
    int result = solution.removeElement(new int[] {2}, 2);
    log.info(String.valueOf(result));
  }
}
