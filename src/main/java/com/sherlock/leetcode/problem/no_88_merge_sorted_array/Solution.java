package com.sherlock.leetcode.problem.no_88_merge_sorted_array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sherlock
 * @date 2022/2/10
 */
public class Solution {
    //bucket sort
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n >= 0) {
            System.arraycopy(nums2, 0, nums1, nums1.length - n, n);
        }
        bucketSort(nums1,m+n);
    }
    private int indexFor(int a, int min, int step) {
        return (a - min) / step;
    }

    public void bucketSort(int[] arr,int step) {

        int max = arr[0], min = arr[0];
        for (int a : arr) {
            if (max < a) {
                max = a;
            }
            if (min > a) {
                min = a;
            }
        }
        List<List<Integer>> buckList = new ArrayList<>();
        // create bucket
        for (int i = 1; i <= step; i++) {
            buckList.add(new ArrayList<>());
        }
        // push into the bucket
        for (int j : arr) {
            int index = indexFor(j, min, step);
            buckList.get(index).add(j);
        }
        ArrayList<Integer> bucket = null;
        int index = 0;
        for (int i = 0; i < step; i++) {
            bucket = (ArrayList<Integer>) buckList.get(i);
            insertSort(bucket);
            for (int k : bucket) {
                arr[index++] = k;
            }
        }

    }

    private void insertSort(List<Integer> bucket) {
        for (int i = 1; i < bucket.size(); i++) {
            int temp = bucket.get(i);
            int j = i - 1;
            for (; j >= 0 && bucket.get(j) > temp; j--) {
                bucket.set(j + 1, bucket.get(j));
            }
            bucket.set(j + 1, temp);
        }
    }
}
