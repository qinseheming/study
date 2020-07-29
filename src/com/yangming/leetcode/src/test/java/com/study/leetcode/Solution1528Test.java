package com.study.leetcode;

import com.study.leetcode.util.ArrayUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author yangming
 * @date 2020/7/28
 */
class Solution1528Test {

    @Test
    void restoreString() {
        String s = "codeleet";
        int[] nums = ArrayUtils.createInt("4,5,6,7,0,2,1,3");
        Solution1528 solution1528 = new Solution1528();
        String restoreString = solution1528.restoreString(s, nums);
        System.out.println(restoreString);
    }
}