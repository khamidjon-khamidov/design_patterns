package head_first_design_patterns.factory.stores;

import head_first_design_patterns.factory.Pizza;
import head_first_design_patterns.factory.PizzaStore;
import head_first_design_patterns.factory.pizzas.*;

public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new ChicagoStyleCheesePizza();
            case "peperoni":
                return new ChicagoStylePeperoniPizza();
            case "clam":
                return new ChicagoStyleClamPizza();
            case "veggie":
                return new ChicagoStyleVeggiePizza();
        }
        return new ChicagoStyleCheesePizza();
    }
}
