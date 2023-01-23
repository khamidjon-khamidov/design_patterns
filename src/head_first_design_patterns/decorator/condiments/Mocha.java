package head_first_design_patterns.decorator.condiments;

import head_first_design_patterns.decorator.Beverage;
import head_first_design_patterns.decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public  Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }


    @Override
    public double cost() {
        return beverage.cost() + .20;
    }
}
