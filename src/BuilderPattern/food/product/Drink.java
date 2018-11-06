package BuilderPattern.food.product;

import BuilderPattern.food.product.Item;

public abstract class Drink implements Item {
    @Override
    public String packing() {
        return "瓶装";
    }
}
