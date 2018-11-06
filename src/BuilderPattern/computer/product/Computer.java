package BuilderPattern.computer.product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GaryLee on 2018-11-06 11:30.
 * 建造后的对象
 */
public class Computer {
    private List<String> parts = new ArrayList<>();
    public void addPart(String part){
        parts.add(part);
    }
    public void show(){
        for(String part:parts){
            System.out.println(part);
        }
        System.out.println("电脑组装完成!");
    }
}
