package design_patterns_theory.Creational.builder.meals;

import design_patterns_theory.Creational.builder.Item;
import design_patterns_theory.Creational.builder.packer.Packing;
import design_patterns_theory.Creational.builder.packer.Wrapper;

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
