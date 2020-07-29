package com.yangming.design_model.src.main.java.com.study.designmodel.bridge;

/**
 * @author yang
 */
public class Phone extends Category {
    public Phone(Brand brand) {
        super(brand);
    }

    @Override
    public void category() {
        System.out.println("智能手机");
    }
}
