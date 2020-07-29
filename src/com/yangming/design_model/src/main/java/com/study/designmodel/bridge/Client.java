package com.yangming.design_model.src.main.java.com.study.designmodel.bridge;

/**
 * @author yang
 */
public class Client {

    public static void main(String[] args) {
        Brand brand = new Lenovo();
        Category category = new Desktop(brand);
        category.category();
    }
}
