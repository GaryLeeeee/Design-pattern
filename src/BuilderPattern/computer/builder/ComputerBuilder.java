package BuilderPattern.computer.builder;

import BuilderPattern.computer.product.Computer;

/**
 * Created by GaryLee on 2018-11-06 11:30.
 * 具体建造者:实现Builder接口来创建具体产品
 */
public class ComputerBuilder implements Builder{
    Computer computer = new Computer();
    @Override
    public void buildCPU() {
        computer.addPart("CPU组装完成...");
    }

    @Override
    public void buildMainboard() {
        computer.addPart("主板组装完成...");
    }

    @Override
    public void buildHD() {
        computer.addPart("硬盘组装完成...");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
