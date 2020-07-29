package com.yangming.design_model.abstractfactory;

public interface CarFactory {

    Engine getEngine();

    Seat getSeat();

    Tyre getTyre();
}
