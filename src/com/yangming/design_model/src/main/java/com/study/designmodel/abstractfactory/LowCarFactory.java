package com.yangming.design_model.src.main.java.com.study.designmodel.abstractfactory;

public class LowCarFactory implements CarFactory{

    @Override
    public Engine getEngine() {
        return new LowEngine();
    }

    @Override
    public Seat getSeat() {
        return new LowSeat();
    }

    @Override
    public Tyre getTyre() {
        return new LowTyre();
    }
}
