package com.sherlock.leetcode.problem.no_1984_minimum_difference;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author sherlock
 * @date 2022/2/11
 */
class MinmumDifferenceTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("provideData")
    void minimumDifference(int[] nums, int k, int answer) {
        int result = solution.minimumDifference(nums, k);
        assertEquals(result, answer, "Answer:" + answer + " ;Error result:" + result);
    }


    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of(new int[]{90}, 1, 0),
                Arguments.of(new int[]{9, 4, 1, 7}, 2, 2)
        );
    }
}