package head_first_design_patterns.decorator.beverages;

import head_first_design_patterns.decorator.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    public double cost() {
        return .89;
    }
}