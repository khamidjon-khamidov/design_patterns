package design_patterns_theory.Behavioral.visitor.computer_parts;

import design_patterns_theory.Behavioral.visitor.ComputerPartVisitor;

public class Keyboard implements ComputerPart {

   @Override
   public void accept(ComputerPartVisitor computerPartVisitor) {
      computerPartVisitor.visit(this);
   }
}