package head_first_design_patterns.compound.patterns;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observer;

//public class Observable implements QuackObservable {
//    ArrayList<Observer> observers = new ArrayList<>();
//    QuackObservable duck;
//
//    public Observable(QuackObservable duck) {
//        this.duck = duck;
//    }
//
//    @Override
//    public void registerObserver(Observer observer) {
//        observers.add(observer);
//    }
//
//    @Override
//    public void notifyObservers() {
//        for (Observer observer : observers) {
//            observer.update(duck);
//        }
//    }
//}
