package com.study.leetcode;

import com.study.leetcode.util.ListNodeUtil;
import org.junit.jupiter.api.Test;

class Solution206Test {

    @Test
    void reverseList() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNodeUtil.print(node1);
        Solution206 solution = new Solution206();
        ListNode node = solution.reverseList(node1);
        ListNodeUtil.print(node);
        node = solution.reverseList2(node1);
        ListNodeUtil.print(node);

    }
}