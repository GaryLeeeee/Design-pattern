package AbstractFactoryPattern;

import AbstractFactoryPattern.interfaces.Color;
import AbstractFactoryPattern.interfaces.Shape;

/**
 * Created by GaryLee on 2018-11-03 12:41.
 * 抽象工厂类(用于获取工厂)
 */
public abstract class AbstractFactory {
    public abstract Shape getShape(String name);
    public abstract Color getColor(String name);
}
