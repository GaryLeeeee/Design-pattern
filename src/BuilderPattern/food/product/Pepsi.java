package BuilderPattern.food.product;

/**
 * Created by GaryLee on 2018-11-06 11:10.
 */
public class Pepsi extends Drink{

    @Override
    public String name() {
        return "百事";
    }

    @Override
    public int price() {
        return 3;
    }
}
