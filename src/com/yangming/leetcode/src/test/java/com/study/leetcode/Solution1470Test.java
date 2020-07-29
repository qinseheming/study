package com.study.leetcode;

import com.study.leetcode.util.ArrayUtils;
import com.study.leetcode.util.PrintUtil;
import org.junit.jupiter.api.Test;

class Solution1470Test {

    @Test
    void shuffle() {
        int[] nums = ArrayUtils.createInt("1,2,3,4,4,3,2,1");
        int n = 4;
        Solution1470 solution1470 = new Solution1470();
        int[] shuffle = solution1470.shuffle(nums, n);
        PrintUtil.printArray(shuffle);
    }
}