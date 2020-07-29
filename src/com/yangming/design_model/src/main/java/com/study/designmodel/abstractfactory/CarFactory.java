package com.yangming.design_model.src.main.java.com.study.designmodel.abstractfactory;

public interface CarFactory {

    Engine getEngine();

    Seat getSeat();

    Tyre getTyre();
}
