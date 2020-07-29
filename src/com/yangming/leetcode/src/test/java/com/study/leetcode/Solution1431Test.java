package com.study.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

class Solution1431Test {

    @Test
    void testKidsWithCandies() {
        int[] candies = new int[]{2, 3, 5, 1, 3};
        int extraCandies = 3;
        Solution1431 solution1431 = new Solution1431();
        List<Boolean> list = solution1431.kidsWithCandies(candies, extraCandies);
        for (Boolean aBoolean : list) {
            System.out.println(aBoolean);
        }
    }
}