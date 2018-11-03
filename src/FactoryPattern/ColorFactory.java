package FactoryPattern;

import java.io.File;

/**
 * Created by GaryLee on 2018-11-03 13:19.
 * 工厂类
 */
public class ColorFactory {
    public static Color getColor(String color){
        try {
            Class clazz = Class.forName("FactoryPattern."+color);
            Object o = clazz.newInstance();
            return (Color) o;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
