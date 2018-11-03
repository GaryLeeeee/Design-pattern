package AbstractFactoryPattern.factory;

import AbstractFactoryPattern.AbstractFactory;
import AbstractFactoryPattern.domain.Rectangle;
import AbstractFactoryPattern.interfaces.Color;
import AbstractFactoryPattern.interfaces.Shape;

/**
 * Created by GaryLee on 2018-11-03 12:41.
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String name) {
        if("rectangle".equals(name))
            return new Rectangle();
        return null;
    }

    @Override
    public Color getColor(String name) {
        return null;
    }
}
