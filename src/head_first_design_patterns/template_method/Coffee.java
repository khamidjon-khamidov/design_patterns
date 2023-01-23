package head_first_design_patterns.template_method;

public class Coffee extends CaffeineBeverage{

    @Override
    public void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}