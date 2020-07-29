package com.study.leetcode.util;

import com.study.leetcode.ListNode;

/**
 * @author yangming
 * @date 2019/10/29
 */
public class PrintUtil {

    public static void printListNode(ListNode listNode) {
        ListNode list = listNode;
        while (list != null) {
            System.out.print(list);
            if (list.next != null) {
                System.out.print(" -> ");
            }
            list = list.next;
        }
    }

    public static void printArray(int[] arr) {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i : arr) {
            builder.append(i).append(", ");
        }
        builder.deleteCharAt(builder.lastIndexOf(", "));
        builder.append("]");
        System.out.println(builder.toString());
    }

    public static void printArray(String[] arr) {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (String i : arr) {
            builder.append(i).append(", ");
        }
        builder.deleteCharAt(builder.lastIndexOf(", "));
        builder.append("]");
        System.out.println(builder.toString());
    }

}
