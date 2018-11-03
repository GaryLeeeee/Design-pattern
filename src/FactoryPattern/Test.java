package FactoryPattern;

/**
 * Created by GaryLee on 2018-11-03 13:22.
 * 工厂模式
 */
public class Test {
    public static void main(String[] args) {
        Color color = ColorFactory.getColor("Red");
        color.draw();
        Color color2 = ColorFactory.getColor("Blue");
        color2.draw();
    }
}
