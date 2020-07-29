package com.yangming.design_model.src.main.java.com.study.designmodel.factory;

/**
 * 简单工厂实现
 */
public class AnimalFactory {

    public static Animal getAnimal(String name) {
        if ("cat".equals(name)) {
            return new Cat();
        } else if ("dog".equals(name)) {
            return new Dog();
        } else {
            return null;
        }
    }
}
