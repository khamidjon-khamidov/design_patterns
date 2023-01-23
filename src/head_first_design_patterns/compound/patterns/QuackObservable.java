package head_first_design_patterns.compound.patterns;

import java.util.Observer;

public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
