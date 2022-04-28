package com.sherlock.leetcode.problem.no_905_sort_array_by_parity;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * @author sherlock
 */
@Slf4j
class SolutionTest {
  Solution solution = new Solution();

  @ParameterizedTest
  @MethodSource("provideData")
  void sortArrayByParity() {
    int[] nums = solution.sortArrayByParity(new int[] {3, 1, 2, 4});
    log.info(Arrays.toString(nums));
  }

  private static Stream<Arguments> provideData() {
    return Stream.of(
      Arguments.of(new int[] {1,8,6,2,5,4,8,3,7}, 49),
      Arguments.of(new int[] {1,1}, 1));
  }
}