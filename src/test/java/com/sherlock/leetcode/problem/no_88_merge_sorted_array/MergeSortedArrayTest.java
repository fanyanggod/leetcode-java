package com.sherlock.leetcode.problem.no_88_merge_sorted_array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author sherlock
 * @date 2022/2/10
 */
class MergeSortedArrayTest {

    Solution solution = new Solution();
    @ParameterizedTest
    @MethodSource("provideData")
    void plusOne(int[] nums1, int m, int[] nums2, int n, int[] answer) {
        solution.merge(nums1,m,nums2,n);
        assertArrayEquals(nums1,answer,
                "Answer:" + Arrays.toString(answer) + " ;Error result:" + Arrays.toString(nums1));
    }

    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of(new int[]{1,2,3,0,0},5,new int[]{2,4},2,new int[]{1,2,2,3,4}),
                Arguments.of(new int[]{1},1,new int[]{},0,new int[]{1}),
                Arguments.of(new int[]{4,5,6,0,0,0},3,new int[]{1,2,3},3,new int[]{1,2,3,4,5,6}),
                Arguments.of(new int[]{0},0,new int[]{1},1,new int[]{1})
        );
    }

}