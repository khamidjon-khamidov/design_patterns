package head_first_design_patterns.factory.stores;

import head_first_design_patterns.factory.Pizza;
import head_first_design_patterns.factory.PizzaStore;
import head_first_design_patterns.factory.pizzas.NYStyleCheesePizza;
import head_first_design_patterns.factory.pizzas.NYStyleClamPizza;
import head_first_design_patterns.factory.pizzas.NYStylePeperoniPizza;
import head_first_design_patterns.factory.pizzas.NyStyleVeggiePizza;

public class NYStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new NYStyleCheesePizza();
            case "peperoni":
                return new NYStylePeperoniPizza();
            case "clam":
                return new NYStyleClamPizza();
            case "veggie":
                return new NyStyleVeggiePizza();
        }
        return new NyStyleVeggiePizza();
    }
}
