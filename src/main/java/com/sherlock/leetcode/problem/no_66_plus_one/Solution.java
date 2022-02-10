package com.sherlock.leetcode.problem.no_66_plus_one;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author sherlock
 * @date 2022/2/10
 */
public class Solution {
    public int[] plusOne(int[] digits) {
        int temp = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (temp == 0 && i == digits.length-1) {
                if (digits[i] < 9) {
                    digits[i] = digits[i] + 1;
                    break;
                }else {
                    temp = 1;
                    digits[i] = 0;
                }
            }else {
                if (digits[i] < 9) {
                    digits[i] = digits[i] + 1;
                    temp = 0;
                    break;
                }else {
                    digits[i] = 0;
                }
            }
        }
        if (temp == 1) {
            digits = Arrays.copyOf(digits, digits.length + 1);
            digits[0] = 1;
        }
        return digits;
    }
}
