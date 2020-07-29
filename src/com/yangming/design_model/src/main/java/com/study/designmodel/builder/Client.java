package com.yangming.design_model.src.main.java.com.study.designmodel.builder;

/**
 * 调用方
 *
 * @author yang
 */
public class Client {

    public static void main(String[] args) {
        AirshipBuilder builder = new MyAirshipBuilder();
        AirshipDirector director = new MyAirshipDirector(builder);
        Airship airship = director.directorAirship();
        System.out.println(airship);
    }
}
