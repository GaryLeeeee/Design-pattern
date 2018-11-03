package AbstractFactoryPattern.domain;

import AbstractFactoryPattern.interfaces.Shape;

/**
 * Created by GaryLee on 2018-11-03 12:39.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("长方形");
    }
}
