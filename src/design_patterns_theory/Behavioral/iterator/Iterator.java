package design_patterns_theory.Behavioral.iterator;

// Iterator pattern is very commonly used design pattern in Java
// and .Net programming environment. This pattern is used to get
// a way to access the elements of a collection object in sequential
// manner without any need to know its underlying representation.
public interface Iterator {
   public boolean hasNext();
   public Object next();
}