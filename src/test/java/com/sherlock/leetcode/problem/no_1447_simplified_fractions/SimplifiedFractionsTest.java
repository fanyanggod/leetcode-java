package com.sherlock.leetcode.problem.no_1447_simplified_fractions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author sherlock
 * @date 2022/2/10
 */
class SimplifiedFractionsTest {
  Solution solution = new Solution();

  @ParameterizedTest
  @MethodSource("provideData")
  void simplifiedFractions(int n, List<String> answer) {
    List<String> result = solution.simplifiedFractions(n);
    assertArrayEquals(
        result.toArray(),
        answer.toArray(),
        "Answer:" + answer.toString() + " ;Error result:" + result.toString());
  }

  private static Stream<Arguments> provideData() {
    return Stream.of(
        Arguments.of(1, new ArrayList<>()),
        Arguments.of(2, Arrays.asList("1/2")),
        Arguments.of(3, Arrays.asList("1/2", "1/3", "2/3")),
        Arguments.of(4, Arrays.asList("1/2", "1/3", "2/3", "1/4", "3/4")));
  }
}
