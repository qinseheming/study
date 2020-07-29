package com.study.leetcode;

import com.study.leetcode.util.PrintUtil;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author yangming
 * @date 2020/6/30
 */
class Solution1480Test {

    @Test
    void testRunningSum() {
        int[] nums = new int[]{3,1,2,10,1};
        Solution1480 solution1480 = new Solution1480();
        int[] result = solution1480.runningSum(nums);
        PrintUtil.printArray(result);
    }
}