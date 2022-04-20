package com.sherlock.leetcode.problem.no_35_search_insert_position;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author sherlock
 * @date 2022/2/9
 */
@Slf4j
class SolutionTest {
  Solution solution = new Solution();

  @ParameterizedTest
  @MethodSource("provideData")
  void searchInsert(int[] nums, int target, int answer) {
    int result = solution.searchInsert(nums, target);
    assertEquals(answer, result, "Answer:" + answer + " ;Error result:" + result);
  }

  private static Stream<Arguments> provideData() {
    return Stream.of(Arguments.of(new int[] {1}, 7, 1), Arguments.of(new int[] {1, 2, 7, 8}, 7, 2));
  }
}
