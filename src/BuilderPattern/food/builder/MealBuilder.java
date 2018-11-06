package BuilderPattern.food.builder;

import BuilderPattern.food.product.*;

/**
 * Created by GaryLee on 2018-11-06 11:22.
 * 用来创建Meal对象
 */
public class MealBuilder {
    public static Meal ChickenMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Coke());
        return meal;
    }
    public static Meal VegetableMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegetableBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
