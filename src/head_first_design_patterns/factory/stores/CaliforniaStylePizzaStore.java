package head_first_design_patterns.factory.stores;

import head_first_design_patterns.factory.Pizza;
import head_first_design_patterns.factory.PizzaStore;
import head_first_design_patterns.factory.pizzas.*;

public class CaliforniaStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new CaliforniaStyleCheesePizza();
            case "peperoni":
                return new CaliforniaStylePeperoniPizza();
            case "clam":
                return new CaliforniaStyleClamPizza();
            case "veggie":
                return new CaliforniaStyleVeggiePizza();
        }
        return new CaliforniaStyleCheesePizza();
    }
}
