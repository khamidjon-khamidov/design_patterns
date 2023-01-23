package design_patterns_theory.Structural.decorator.shapes;

public class Circle implements Shape {

    // Overriding the method
    @Override public void draw()
    {
        // /Print statement to execute when
        // draw() method of this class is called
        // later on in the main() method
        System.out.println("Shape: Circle");
    }
}
