package com.study.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author yangming
 * @date 2020/7/28
 */
class Solution1342Test {

    @Test
    void numberOfSteps() {
        int num = 1000000;
        Solution1342 solution1342 = new Solution1342();
        int result = solution1342.numberOfSteps(num);
        System.out.println(result);

    }
}