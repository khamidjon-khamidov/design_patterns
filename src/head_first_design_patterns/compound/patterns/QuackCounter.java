//package head_first_design_patterns.compound.patterns;
//
//import head_first_design_patterns.compound.Quackable;
//
//import java.util.Observer;
//
//public class QuackCounter implements Quackable {
//    Observable observable;
//    Quackable duck;
//    static int numberOfQuacks;
//
//    public QuackCounter(Quackable duck){
//        this.duck = duck;
//        observable = new Observable(this);
//    }
//
//    @Override
//    public void quack() {
//        duck.quack();
//        numberOfQuacks++;
//        notifyObservers();
//    }
//
//    public static int getQuacks() {
//        return numberOfQuacks;
//    }
//
//    @Override
//    public void registerObserver(Observer observer) {
//        observable.registerObserver(observer);
//    }
//
//    @Override
//    public void notifyObservers() {
//        observable.notifyObservers();
//    }
//}
