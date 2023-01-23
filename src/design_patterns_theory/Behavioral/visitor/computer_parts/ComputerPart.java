package design_patterns_theory.Behavioral.visitor.computer_parts;

import design_patterns_theory.Behavioral.visitor.ComputerPartVisitor;

public interface ComputerPart {
   public void accept(ComputerPartVisitor computerPartVisitor);
}