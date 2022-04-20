package com.sherlock.leetcode.problem.no_1189_max_number_of_ballboon;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author sherlock
 * @date 2022/2/13
 */
class MaxNumberOfBalloonsTest {
  Solution solution = new Solution();

  @ParameterizedTest
  @MethodSource("provideData")
  void maxNumberOfBalloons(String text, int answer) {
    int result = solution.maxNumberOfBalloons(text);
    assertEquals(result, answer, "Answer:" + answer + " ;Error result:" + result);
  }

  private static Stream<Arguments> provideData() {
    return Stream.of(
        Arguments.of("nlaebolko", 1),
        Arguments.of("leetcode", 0),
        Arguments.of("balon", 0),
        Arguments.of("baloon", 0),
        Arguments.of("ballon", 0),
        Arguments.of("balllllllllllloooooooooon", 1),
        Arguments.of("loonbalxballpoon", 2));
  }
}
