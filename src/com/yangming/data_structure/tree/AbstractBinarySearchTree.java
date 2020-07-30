package com.yangming.data_structure.tree;

/**
 * 二分搜索树
 * 从小到大排列
 * // TODO 重新实现一遍二叉搜索树
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

    /**
     * 层序遍历
     */
    abstract void levelOrder();

    /**
     * 寻找二分搜索树的最小值
     *
     * @return 二分搜索树的最小值
     */
    abstract E minimum();

    /**
     * 寻找二分搜索树的最大值
     *
     * @return 二分搜索树的最大值
     */
    abstract E maximum();

    /**
     * 删除最小值
     *
     * @return 最小值
     */
    abstract E removeMin();

    /**
     * 删除最大值
     *
     * @return 最大值
     */
    abstract E removeMax();

    /**
     * 删除指定的元素
     *
     * @param e 要删除的元素
     * @return 是否删除成功
     */
    abstract boolean remove(E e);

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        this.preToString(root, 0, builder);
        return builder.toString();
    }

    /**
     * 前序遍历打印二叉树
     *
     * @param node    当前节点
     * @param depth   当前节点所在层数
     * @param builder 字符串
     */
    private void preToString(Node node, int depth, StringBuilder builder) {
        if (node == null) {
            builder.append(this.generateDepthStr(depth)).append("null\n");
            return;
        }
        builder.append(this.generateDepthStr(depth)).append(node.e).append("\n");
        this.preToString(node.left, depth + 1, builder);
        this.preToString(node.right, depth + 1, builder);
    }

    private String generateDepthStr(int depth) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            builder.append("--");
        }
        return builder.toString();
    }

}