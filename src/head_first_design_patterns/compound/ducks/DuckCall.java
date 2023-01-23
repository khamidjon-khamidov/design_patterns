package head_first_design_patterns.compound.ducks;

import head_first_design_patterns.compound.Quackable;

import java.util.Observable;
import java.util.Observer;

public class DuckCall implements Quackable {
    Observable observable;

    @Override
    public void quack() {
        System.out.println("Kwak");
        observable = new Observable();
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
