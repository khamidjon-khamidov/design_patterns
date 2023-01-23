package head_first_design_patterns.decorator;

public abstract class Beverage {
    public String description = "Unknown Beverage";

    public  String getDescription(){
        return description;
    }

    public abstract double cost();
}
