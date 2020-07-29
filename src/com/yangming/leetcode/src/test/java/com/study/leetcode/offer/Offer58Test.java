package com.study.leetcode.offer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author yangming
 * @date 2020/7/4
 */
class Offer58Test {

    @Test
    void reverseLeftWords() {
        String s = "abcdefg";
        int k = 2;
        Offer58 offer58 = new Offer58();
        String result = offer58.reverseLeftWords(s, k);
        assertEquals("cdefgab", result);

    }
}