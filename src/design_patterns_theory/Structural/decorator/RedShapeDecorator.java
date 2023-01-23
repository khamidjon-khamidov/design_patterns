package design_patterns_theory.Structural.decorator;

import design_patterns_theory.Structural.decorator.shapes.Shape;

public class RedShapeDecorator extends ShapeDecorator {
 
    public RedShapeDecorator(Shape decoratedShape)
    {
        super(decoratedShape);
    }
 
    @Override public void draw()
    {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }
 
    private void setRedBorder(Shape decoratedShape)
    {
      // Display message whenever function is called
        System.out.println("Border Color: Red");
    }
}