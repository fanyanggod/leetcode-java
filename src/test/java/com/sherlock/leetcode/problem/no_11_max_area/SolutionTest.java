package com.sherlock.leetcode.problem.no_11_max_area;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * @author sherlock
 */
class SolutionTest {
  Solution solution = new Solution() ;

  @ParameterizedTest
  @MethodSource("provideData")
  void maxArea(int[] height,int answer) {
    int result = solution.maxArea(height);
    assertEquals(result,answer);
  }

  private static Stream<Arguments> provideData() {
    return Stream.of(
      Arguments.of(new int[] {1,8,6,2,5,4,8,3,7}, 49),
      Arguments.of(new int[] {1,1}, 1));
  }

}