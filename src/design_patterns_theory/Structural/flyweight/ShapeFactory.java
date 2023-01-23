package design_patterns_theory.Structural.flyweight;

import design_patterns_theory.Structural.flyweight.shape.Circle;
import design_patterns_theory.Structural.flyweight.shape.Shape;

import java.util.HashMap;

// Flyweight pattern is primarily used to reduce the number of objects created and
// to decrease memory footprint and increase performance. This type of design pattern
// comes under structural pattern as this pattern provides ways to decrease object count
// thus improving the object structure of application.
public class ShapeFactory {

   // Uncomment the compiler directive line and
   // javac *.java will compile properly.
   // @SuppressWarnings("unchecked")
   private static final HashMap<String, Circle> circleMap = new HashMap<>();

   public static Shape getCircle(String color) {
      Circle circle = (Circle)circleMap.get(color);

      if(circle == null) {
         circle = new Circle(color);
         circleMap.put(color, circle);
         System.out.println("Creating circle of color : " + color);
      }
      return circle;
   }
}