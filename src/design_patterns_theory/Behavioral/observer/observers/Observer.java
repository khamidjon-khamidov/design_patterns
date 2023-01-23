package design_patterns_theory.Behavioral.observer.observers;

import design_patterns_theory.Behavioral.observer.Subject;

public abstract class Observer {
   protected Subject subject;
   public abstract void update();
}