package AbstractFactoryPattern.domain;

import AbstractFactoryPattern.interfaces.Color;

/**
 * Created by GaryLee on 2018-11-03 12:38.
 */
public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("红色");
    }
}
