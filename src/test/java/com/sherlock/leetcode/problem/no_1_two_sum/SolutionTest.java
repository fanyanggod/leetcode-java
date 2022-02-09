package com.sherlock.leetcode.problem.no_1_two_sum;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


/**
 * @author sherlock
 * @date 2022/2/9
 */
@Slf4j
class SolutionTest {
    Solution solution = new Solution();

    @Test
    void twoSum() {
        int[] result = solution.twoSum(new int[]{2,7,11,15}, 9);
        log.info(Arrays.toString(result));
    }
}