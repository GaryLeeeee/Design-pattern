package BuilderPattern.food.product;

import BuilderPattern.food.product.Item;

/**
 * Created by GaryLee on 2018-11-06 11:03.
 */
public abstract class Burger implements Item {
    @Override
    public String packing() {
        return "纸质包装";
    }
}
