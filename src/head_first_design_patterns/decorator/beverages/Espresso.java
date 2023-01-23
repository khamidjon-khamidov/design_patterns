package head_first_design_patterns.decorator.beverages;

import head_first_design_patterns.decorator.Beverage;

public class Espresso extends Beverage {
    public Espresso(){
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
