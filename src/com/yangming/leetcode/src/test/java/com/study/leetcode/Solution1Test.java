package com.study.leetcode;

import org.junit.jupiter.api.Test;

import static com.study.leetcode.Solution1.twoSum2;

/**
 * @author yangming
 * @date 2020/6/29
 */
class Solution1Test {

    @Test
    void twoSum() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum2(nums, target);
        for (int i: result) {
            System.out.println(i);
        }
    }

}