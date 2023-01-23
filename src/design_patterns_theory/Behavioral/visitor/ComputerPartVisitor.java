package design_patterns_theory.Behavioral.visitor;

import design_patterns_theory.Behavioral.visitor.computer_parts.Computer;
import design_patterns_theory.Behavioral.visitor.computer_parts.Keyboard;
import design_patterns_theory.Behavioral.visitor.computer_parts.Monitor;
import design_patterns_theory.Behavioral.visitor.computer_parts.Mouse;

// In Visitor pattern, we use a visitor class which
// changes the executing algorithm of an element class.
// By this way, execution algorithm of element can vary
// as and when visitor varies. This pattern comes under
// behavior pattern category. As per the pattern, element
// object has to accept the visitor object so that visitor
// object handles the operation on the element object.
public interface ComputerPartVisitor {
	public void visit(Computer computer);
	public void visit(Mouse mouse);
	public void visit(Keyboard keyboard);
	public void visit(Monitor monitor);
}