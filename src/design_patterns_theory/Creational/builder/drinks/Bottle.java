package design_patterns_theory.Creational.builder.drinks;

import design_patterns_theory.Creational.builder.packer.Packing;

public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}
