package head_first_design_patterns.decorator.beverages;

import head_first_design_patterns.decorator.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast(){
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
