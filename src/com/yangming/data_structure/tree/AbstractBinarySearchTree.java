package com.yangming.data_structure.tree;

/**
 * 二分搜索树
 * 从小到大排列
 *
 * @author yangming
 * @date 2020/7/29
 */
public abstract class AbstractBinarySearchTree<E extends Comparable<E>> {

    protected class Node {
        public E e;
        public Node left;
        public Node right;

        public Node(E e) {
            this.e = e;
        }
    }

    /**
     * 根节点
     */
    protected Node root;

    /**
     * 当前二分搜索树数据量
     */
    protected int size;

    /**
     * 返回当前二叉树数据量
     *
     * @return 当前二叉树数据量
     */
    public int size() {
        return size;
    }

    /**
     * 当前二叉树中是否为空
     *
     * @return 当前二叉树中是否为空
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 向二叉树中添加元素，如果元素已存在则不做任何操作
     *
     * @param e 要添加的元素
     */
    abstract void add(E e);

    /**
     * 查找二叉树中是否有该元素
     *
     * @param e 要查找的元素
     * @return 是否有该元素
     */
    abstract boolean contains(E e);

    /**
     * 前序遍历
     */
    abstract void preOrder();

    /**
     * 中序遍历
     */
    abstract void inOrder();

    /**
     * 后序遍历
     */
    abstract void postOrder();

}