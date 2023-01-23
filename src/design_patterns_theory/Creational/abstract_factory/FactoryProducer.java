package design_patterns_theory.Creational.abstract_factory;

import design_patterns_theory.Creational.abstract_factory.shape_factory.EdgedShapeFactory;
import design_patterns_theory.Creational.abstract_factory.shape_factory.RoundedShapeFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean rounded) {
        if (rounded) {
            return new RoundedShapeFactory();
        } else {
            return new EdgedShapeFactory();
        }
    }
}
