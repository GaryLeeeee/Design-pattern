package BuilderPattern.computer.builder;

import BuilderPattern.computer.product.Computer;

/**
 * Created by GaryLee on 2018-11-06 11:28.
 * 建造者接口(声明具体建造者的公共接口:建造过程和返回产品的方法)
 */
public interface Builder {
    void buildCPU();
    void buildMainboard();
    void buildHD();
    Computer getComputer();
}
