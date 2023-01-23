package design_patterns_theory.Creational.builder.drinks;

import design_patterns_theory.Creational.builder.Item;
import design_patterns_theory.Creational.builder.packer.Packing;

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
