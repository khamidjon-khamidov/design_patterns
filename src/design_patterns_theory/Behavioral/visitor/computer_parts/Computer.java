package design_patterns_theory.Behavioral.visitor.computer_parts;

import design_patterns_theory.Behavioral.visitor.ComputerPartVisitor;

public class Computer implements ComputerPart {
	
   ComputerPart[] parts;

   public Computer(){
      parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};		
   } 


   @Override
   public void accept(ComputerPartVisitor computerPartVisitor) {
      for (ComputerPart part : parts) {
         part.accept(computerPartVisitor);
      }
      computerPartVisitor.visit(this);
   }
}