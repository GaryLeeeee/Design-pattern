package BuilderPattern.food;

import BuilderPattern.food.builder.MealBuilder;
import BuilderPattern.food.product.Meal;

/**
 * Created by GaryLee on 2018-11-06 11:25.
 */
public class Test {
    public static void main(String[] args) {
        Meal meal = MealBuilder.ChickenMeal();
        meal.show();
    }
}
