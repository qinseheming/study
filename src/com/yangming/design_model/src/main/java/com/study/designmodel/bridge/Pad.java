package com.yangming.design_model.src.main.java.com.study.designmodel.bridge;

/**
 * @author yang
 */
public class Pad extends Category {
    public Pad(Brand brand) {
        super(brand);
    }

    @Override
    public void category() {
        System.out.println("平板电脑");
    }
}
