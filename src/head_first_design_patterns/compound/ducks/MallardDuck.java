//package head_first_design_patterns.compound.ducks;
//
//import head_first_design_patterns.compound.Quackable;
//import head_first_design_patterns.compound.patterns.Observable;
//
//import java.util.Observer;
//
//public class MallardDuck implements Quackable {
//    Observable observable;
//
//    public MallardDuck() {
//        observable = new Observable(this);
//    }
//
//    @Override
//    public void quack() {
//        System.out.println("Quack");
//        notifyObservers();
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
