package BuilderPattern.computer.director;

import BuilderPattern.computer.builder.Builder;

/**
 * Created by GaryLee on 2018-11-06 16:30.
 * 指挥者(用来构建一个使用Builder接口的对象)
 */
public class Director {
    public static void install(Builder builder){
        builder.buildCPU();
        builder.buildMainboard();
        builder.buildHD();
    }
}
