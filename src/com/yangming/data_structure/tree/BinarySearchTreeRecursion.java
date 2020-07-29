package com.yangming.data_structure.tree;

/**
 * 递归方式实现二叉树
 *
 * @author yangming
 * @date 2020/7/29
 */
public class BinarySearchTreeRecursion<E extends Comparable<E>> extends AbstractBinarySearchTree<E> {

    /**
     * 向二叉树中添加元素，如果元素已存在则不做任何操作
     *
     * @param e 要添加的元素
     */
    @Override
    public void add(E e) {
        root = this.add(root, e);
    }

    /**
     * 查找二叉树中是否有该元素
     *
     * @param e 要查找的元素
     * @return 是否有该元素
     */
    @Override
    public boolean contains(E e) {
        return this.contains(root, e);
    }


    /**
     * 前序遍历
     */
    @Override
    public void preOrder() {
        this.preOrder(root);
    }

    /**
     * 中序遍历
     */
    @Override
    public void inOrder() {
        this.inOrder(root);
    }

    /**
     * 后序遍历
     */
    @Override
    public void postOrder() {
        this.postOrder(root);
    }

    private Node add(Node node, E e) {
        if (node == null) {
            size++;
            return new Node(e);
        }
        if (e.compareTo(node.e) < 0) {
            node.left = this.add(node.left, e);
        } else if (e.compareTo(node.e) > 0) {
            node.right = this.add(node.right, e);
        }
        return node;
    }

    private boolean contains(Node node, E e) {
        if (node == null) {
            return false;
        }
        if (e.compareTo(node.e) == 0) {
            return true;
        } else if (e.compareTo(node.e) < 0) {
            return this.contains(node.left, e);
        } else {
            return this.contains(node.right, e);
        }
    }

    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.e);
        this.preOrder(node.left);
        this.preOrder(node.right);
    }

    private void inOrder(Node node) {
        if (node == null) {
            return;
        }
        this.inOrder(node.left);
        System.out.println(node.e);
        this.inOrder(node.right);
    }

    private void postOrder(Node node) {
        if (node == null) {
            return;
        }
        this.postOrder(node.left);
        this.postOrder(node.right);
        System.out.println(node.e);
    }

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
