//package head_first_design_patterns.compound.patterns;
//
//import head_first_design_patterns.compound.Quackable;
//import head_first_design_patterns.compound.ducks.DuckCall;
//import head_first_design_patterns.compound.ducks.MallardDuck;
//import head_first_design_patterns.compound.ducks.RedHeadDuck;
//import head_first_design_patterns.compound.ducks.RubberDuck;
//
//public class CountingDuckFactory extends AbstractDuckFactory {
//    public Quackable createMallardDuck() {
//        return new QuackCounter(new MallardDuck());
//    }
//
//    public Quackable createRedheadDuck() {
//        return new QuackCounter(new RedHeadDuck());
//    }
//
//    public Quackable createDuckCall() {
//        return new QuackCounter(new DuckCall());
//    }
//
//    public Quackable createRubberDuck() {
//        return new QuackCounter(new RubberDuck());
//    }
//}