package com.yangming.design_model.src.main.java.com.study.designmodel.decorator;

public class Client {
    public static void main(String[] args) {
        FlyCar flyCar = new FlyCar(new Car());
        flyCar.move();

        SwimCar swimCar = new SwimCar(flyCar);
        swimCar.move();
    }
}
