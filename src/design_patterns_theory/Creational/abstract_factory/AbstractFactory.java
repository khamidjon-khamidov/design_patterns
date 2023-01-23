package design_patterns_theory.Creational.abstract_factory;

import design_patterns_theory.Creational.abstract_factory.shapes.Shape;

/// Abstract Factory Pattern says that just define an interface or abstract class for creating families of related (or dependent) objects
// but without specifying their concrete subclasses.That means Abstract Factory lets a class returns a factory of classes.
// So, this is the reason that Abstract Factory Pattern is one level higher than the Factory Pattern.
//
//*** An Abstract Factory Pattern is also known as Kit.
//
//*** Advantage of Abstract Factory Pattern
//  1. Abstract Factory Pattern isolates the client code from concrete (implementation) classes.
//  2. It eases the exchanging of object families.
//  3. It promotes consistency among objects.
//
//*** Usage of Abstract Factory Pattern
//  1. When the system needs to be independent of how its object are created, composed, and represented.
//  2. When the family of related objects has to be used together, then this constraint needs to be enforced.
//  3. When you want to provide a library of objects that does not show implementations and only reveals interfaces.
//  4. When the system needs to be configured with one of a multiple family of objects.
public abstract class AbstractFactory {
    public abstract Shape getShape(String shapeType) ;
}
