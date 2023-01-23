package design_patterns_theory.Creational.builder;

import design_patterns_theory.Creational.builder.packer.Packing;

public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
