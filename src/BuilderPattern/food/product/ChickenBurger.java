package BuilderPattern.food.product;

/**
 * Created by GaryLee on 2018-11-06 11:07.
 */
public class ChickenBurger extends Burger{
    @Override
    public String name() {
        return "鸡肉汉堡";
    }

    @Override
    public int price() {
        return 10;
    }
}
