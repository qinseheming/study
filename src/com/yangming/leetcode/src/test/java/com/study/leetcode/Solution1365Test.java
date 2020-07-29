package com.study.leetcode;

import com.study.leetcode.util.ArrayUtils;
import com.study.leetcode.util.PrintUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author yangming
 * @date 2020/7/29
 */
class Solution1365Test {

    @Test
    void smallerNumbersThanCurrent() {
        int[] nums = ArrayUtils.createInt("8,1,2,2,3");
        Solution1365 solution1365 = new Solution1365();
        int[] result = solution1365.smallerNumbersThanCurrent(nums);
        PrintUtil.printArray(result);
    }
}