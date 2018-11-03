package AbstractFactoryPattern.factory;

import AbstractFactoryPattern.AbstractFactory;
import AbstractFactoryPattern.domain.Red;
import AbstractFactoryPattern.interfaces.Color;
import AbstractFactoryPattern.interfaces.Shape;

/**
 * Created by GaryLee on 2018-11-03 12:45.
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String name) {
        return null;
    }

    @Override
    public Color getColor(String name) {
        if("red".equals(name))
            return new Red();
        return null;
    }
}
