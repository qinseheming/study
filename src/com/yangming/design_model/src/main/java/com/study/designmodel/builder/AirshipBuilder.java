package com.yangming.design_model.src.main.java.com.study.designmodel.builder;

/**
 * 飞船构建器
 *
 * @author 75442
 */
public interface AirshipBuilder {

    Engine buildEngine();

    EscapeTower buildEscapeTower();

    OrbitalModule buildOrbitalModule();

}
