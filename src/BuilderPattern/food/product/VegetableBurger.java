package BuilderPattern.food.product;

import BuilderPattern.food.product.Burger;

/**
 * Created by GaryLee on 2018-11-06 11:06.
 */
public class VegetableBurger extends Burger {

    @Override
    public String name() {
        return "蔬菜汉堡";
    }

    @Override
    public int price() {
        return 8;
    }
}
