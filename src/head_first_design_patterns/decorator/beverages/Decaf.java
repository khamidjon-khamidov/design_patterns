package head_first_design_patterns.decorator.beverages;

import head_first_design_patterns.decorator.Beverage;

public class Decaf extends Beverage {
    public Decaf(){
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
