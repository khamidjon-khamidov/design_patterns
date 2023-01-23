package design_patterns_theory.Behavioral.state;

// In State pattern a class behavior changes based on its state.
// This type of design pattern comes under behavior pattern.
//
//In State pattern, we create objects which represent various
// states and a context object whose behavior varies as its state object changes.
public interface State {
   public void doAction(Context context);
}