package com.sherlock.leetcode.problem.no_35_search_insert_position;

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
    void searchInsert() {
        int result = solution.searchInsert(new int[]{1}, 7);
        log.info(String.valueOf(result));
    }
}