package AbstractFactoryPattern;

import AbstractFactoryPattern.factory.ColorFactory;
import AbstractFactoryPattern.factory.ShapeFactory;

/**
 * Created by GaryLee on 2018-11-03 12:46.
 * 工厂创造类(根据传递参数类型获取对应工厂)
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String name){
        if("SHAPE".equals(name))
            return new ShapeFactory();
        else if("COLOR".equals(name))
            return new ColorFactory();
        return null;
    }
}
