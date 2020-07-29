package com.study.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author yangming
 * @date 2020/6/30
 */
class Solution1486Test {

    Solution1486 solution1486 = new Solution1486();

    @Test
    void xorOperation() {
        int n = 5;
        int start = 0;
        int i = solution1486.xorOperation(n, start);
        assertEquals(8, i);
    }
}