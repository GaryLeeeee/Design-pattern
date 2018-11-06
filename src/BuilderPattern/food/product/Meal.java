package BuilderPattern.food.product;

import BuilderPattern.food.product.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GaryLee on 2018-11-06 11:14.
 * 套餐(分主食和饮料)
 */
public class Meal {
    public List<Item> items = new ArrayList<>();
    public void addItem(Item item){
        items.add(item);
    }
    public int getCost(){
        int cost = 0;
        for(Item item:items)
            cost += item.price();
        return cost;
    }
    public void show(){
        for(Item item:items){
            System.out.print("名称:"+item.name()+"\t");
            System.out.println("价格:"+item.price()+"\t");
        }
        System.out.println("总计:"+getCost()+"\t");
    }
}
