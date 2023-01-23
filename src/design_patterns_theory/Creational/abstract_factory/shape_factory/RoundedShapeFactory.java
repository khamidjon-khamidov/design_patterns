package design_patterns_theory.Creational.abstract_factory.shape_factory;

import design_patterns_theory.Creational.abstract_factory.AbstractFactory;
import design_patterns_theory.Creational.abstract_factory.shapes.RoundedRectangle;
import design_patterns_theory.Creational.abstract_factory.shapes.RoundedSquare;
import design_patterns_theory.Creational.abstract_factory.shapes.Shape;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new RoundedRectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new RoundedSquare();
        }
        return null;
    }
}
