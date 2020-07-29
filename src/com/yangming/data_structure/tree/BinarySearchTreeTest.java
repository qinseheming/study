package com.yangming.data_structure.tree;

/**
 * @author yangming
 * @date 2020/7/29
 */
public class BinarySearchTreeTest {

    public static void main(String[] args) {
        AbstractBinarySearchTree<Integer> tree = new BinarySearchTreeRecursion<>();
        int[] arr = new int[]{5, 3, 6, 8, 4, 2};
        for (int i : arr) {
            tree.add(i);
        }
        tree.preOrder();

        AbstractBinarySearchTree<Integer> tree2 = new BinarySearchTreeNotRecursion<>();
        int[] arr2 = new int[]{5, 3, 6, 8, 4, 2};
        for (int i : arr2) {
            tree2.add(i);
    }
        tree2.preOrder();
    }

}
