package com.yangming.design_model.src.main.java.com.study.designmodel.decorator;

/**
 * 装饰模式的具体组件
 */
public class Car implements ICar {
    @Override
    public void move() {
        System.out.println("在陆地上跑");
    }
}
