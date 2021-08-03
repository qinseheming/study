package com.yangming.leetcode;

import com.yangming.leetcode.util.ArrayUtils;
import com.yangming.leetcode.util.PrintUtil;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 给你一个整数数组 nums ，你需要找出一个 连续子数组 ，如果对这个子数组进行升序排序，那么整个数组都会变为升序排序。
 * <p>
 * 请你找出符合题意的 最短 子数组，并输出它的长度。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/shortest-unsorted-continuous-subarray
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution581 {


    public int findUnsortedSubarray(int[] nums) {
        /*
        1. 从左到右便利，找到第一个比之前的最大值小的数
        2. 找到这个数如果排序应该排的位置，此位置就是最短子数组的开始
        3. 从右向左便利，找到第一个比之前的最小值大的数
        4。 找到这个数如果排序应该排的位置，此位置就是最短子数组的结束
         */
        if (nums.length == 0 || nums.length == 1) {
            return 0;
        }
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= max) {
                max = nums[i];
                continue;
            }

        }
        return 0;
    }

    public int findUnsortedSubarray2(int[] nums) {
        /*
        1. 新建一个数组，将原数组排好序后放入新数组
        2. 对比两个数组从左到右第一个不一致的位置、从右到左第一个不一致的位置
         */
        if (nums.length == 0) {
            return 0;
        }
        int[] sortedNums = new int[nums.length];
        System.arraycopy(nums, 0, sortedNums, 0, nums.length);
        Arrays.sort(sortedNums);
        PrintUtil.printArray(nums);
        PrintUtil.printArray(sortedNums);
        int startIndex = 0;
        int endIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != sortedNums[i]) {
                startIndex = i;
                break;
            }
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] != sortedNums[i]) {
                endIndex = i;
                break;
            }
        }
        int result = endIndex - startIndex + 1;
        if (endIndex <= startIndex) {
            return 0;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution581 solution581 = new Solution581();
        int[] nums = {1};
        int result = solution581.findUnsortedSubarray2(nums);
        System.out.println(result);
    }

}


















