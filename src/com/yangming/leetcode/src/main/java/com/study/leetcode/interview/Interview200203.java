package com.study.leetcode.interview;

import com.study.leetcode.ListNode;

/**
 * @author yangming
 * @date 2020/7/4
 */
public class Interview200203 {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
