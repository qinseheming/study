package com.study.leetcode;

import com.study.leetcode.util.ArrayUtils;
import com.study.leetcode.util.PrintUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author yangming
 * @date 2020/7/29
 */
class Solution1389Test {

    @Test
    void createTargetArray() {
        int[] nums = ArrayUtils.createInt("1");
        int[] index = ArrayUtils.createInt("0");
        Solution1389 solution1389 = new Solution1389();
        int[] targetArray = solution1389.createTargetArray(nums, index);
        PrintUtil.printArray(targetArray);

    }
}