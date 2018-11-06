package BuilderPattern.food.product;

/**
 * Created by GaryLee on 2018-11-06 11:10.
 */
public class Coke extends Drink{

    @Override
    public String name() {
        return "可乐";
    }

    @Override
    public int price() {
        return 2;
    }
}
