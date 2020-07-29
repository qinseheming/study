package com.yangming.design_model.src.main.java.com.study.designmodel.abstractfactory;

public class HighCarFactory implements CarFactory {
    @Override
    public Engine getEngine() {
        return new HighEngine();
    }

    @Override
    public Seat getSeat() {
        return new HighSeat();
    }

    @Override
    public Tyre getTyre() {
        return new HighTyre();
    }
}
