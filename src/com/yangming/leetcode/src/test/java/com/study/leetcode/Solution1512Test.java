package com.study.leetcode;

import com.study.leetcode.util.ArrayUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author yangming
 * @date 2020/7/28
 */
class Solution1512Test {

    @Test
    void numIdenticalPairs() {
        int[] nums = ArrayUtils.createInt("1,2,3,1,1,3");
        Solution1512 solution1512 = new Solution1512();
        int result = solution1512.numIdenticalPairs(nums);
        System.out.println(result);
    }
}