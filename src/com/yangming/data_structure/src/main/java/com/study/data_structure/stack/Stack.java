package com.yangming.data_structure.src.main.java.com.study.data_structure.stack;

public interface Stack<E> {

    int getSize();

    boolean isEmpty();

    E pop();

    void push(E e);

    E peek();
}
