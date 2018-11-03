package AbstractFactoryPattern;


import AbstractFactoryPattern.interfaces.Color;
import AbstractFactoryPattern.interfaces.Shape;

/**
 * Created by GaryLee on 2018-11-03 13:07.
 * 抽象工厂模式
 */
public class Test {
    public static void main(String[] args) {
        //获取颜色工厂
        AbstractFactory abstractFactory = FactoryProducer.getFactory("COLOR");
        //获取颜色
        Color color = abstractFactory.getColor("red");
        //调用红色方法
        color.fill();

        //获取形状工厂
        AbstractFactory abstractFactory2 = FactoryProducer.getFactory("SHAPE");
        //获取形状
        Shape shape = abstractFactory2.getShape("rectangle");
        //调用长方形方法
        shape.draw();

    }
}
