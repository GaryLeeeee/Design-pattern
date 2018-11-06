package BuilderPattern.computer;

import BuilderPattern.computer.builder.Builder;
import BuilderPattern.computer.builder.ComputerBuilder;
import BuilderPattern.computer.director.Director;
import BuilderPattern.computer.product.Computer;

/**
 * Created by GaryLee on 2018-11-06 16:26.
 */
public class Test {
    public static void main(String[] args) {
        Builder builder = new ComputerBuilder();
        Director.install(builder);
        Computer computer = builder.getComputer();
        computer.show();
    }
}
