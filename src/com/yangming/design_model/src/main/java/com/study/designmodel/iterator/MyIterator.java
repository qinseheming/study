package com.yangming.design_model.src.main.java.com.study.designmodel.iterator;

/**
 * @author yang
 */
public interface MyIterator<T> {

    void first();

    void last();

    T next();

    boolean hasNext();

}
