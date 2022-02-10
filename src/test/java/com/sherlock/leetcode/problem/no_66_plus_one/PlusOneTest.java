package com.sherlock.leetcode.problem.no_66_plus_one;

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
 * @date 2022/2/10
 */
class PlusOneTest {
    Solution solution = new Solution();
    @ParameterizedTest
    @MethodSource("provideData")
    void plusOne(int[] digits, int[] answer) {
        int[] result = solution.plusOne(digits);
        assertArrayEquals(result,answer,
                "Answer:" + Arrays.toString(answer) + " ;Error result:" + Arrays.toString(result));
    }

    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of(new int[]{1,2,3},new int[]{1,2,4}),
                Arguments.of(new int[]{4,3,2,1},new int[]{4,3,2,2}),
                Arguments.of(new int[]{4,9,9,9},new int[]{5,0,0,0}),
                Arguments.of(new int[]{9,9,9},new int[]{1,0,0,0}),
                Arguments.of(new int[]{9},new int[]{1,0})
        );
    }
}