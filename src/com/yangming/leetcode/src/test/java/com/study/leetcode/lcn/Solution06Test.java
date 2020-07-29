package com.study.leetcode.lcn;

import com.study.leetcode.util.ArrayUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author yangming
 * @date 2020/7/28
 */
class Solution06Test {

    @Test
    void minCount() {
        int[] nums = ArrayUtils.createInt("2,3,10");
        Solution06 solution06 = new Solution06();
        int result = solution06.minCount(nums);
        System.out.println(result);
    }
}