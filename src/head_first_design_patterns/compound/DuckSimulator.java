//package head_first_design_patterns.compound;
//
//import head_first_design_patterns.compound.ducks.DuckCall;
//import head_first_design_patterns.compound.ducks.MallardDuck;
//import head_first_design_patterns.compound.ducks.RedHeadDuck;
//import head_first_design_patterns.compound.ducks.RubberDuck;
//import head_first_design_patterns.compound.geese.Goose;
//import head_first_design_patterns.compound.patterns.*;
//
//public class DuckSimulator {
//    public static void main(String[] args) {
//        DuckSimulator simulator = new DuckSimulator();
//        AbstractDuckFactory duckFactory = new CountingDuckFactory();
//        simulator.simulate(duckFactory);
//    }
//
//    void simulate(AbstractDuckFactory duckFactory) {
//        Quackable mallardDuck = duckFactory.createMallardDuck();
//        Quackable redheadDuck = duckFactory.createRedheadDuck();
//        Quackable duckCall = duckFactory.createDuckCall();
//        Quackable rubberDuck = duckFactory.createRubberDuck();
//        Quackable gooseDuck = new GooseAdapter(new Goose());
//        System.out.println("\nDuck Simulator: With Composite - Flocks");
//
//        FlockComposite flockOfDucks = new FlockComposite();
//
//        flockOfDucks.add(redheadDuck);
//        flockOfDucks.add(duckCall);
//        flockOfDucks.add(rubberDuck);
//        flockOfDucks.add(gooseDuck);
//
//        FlockComposite flockOfMallards = new FlockComposite();
//
//        Quackable mallardOne = duckFactory.createMallardDuck();
//        Quackable mallardTwo = duckFactory.createMallardDuck();
//        Quackable mallardThree = duckFactory.createMallardDuck();
//        Quackable mallardFour = duckFactory.createMallardDuck();
//
//        flockOfMallards.add(mallardOne);
//        flockOfMallards.add(mallardTwo);
//        flockOfMallards.add(mallardThree);
//        flockOfMallards.add(mallardFour);
//
//        flockOfDucks.add(flockOfMallards);
//
//        System.out.println("\nDuck Simulator: Whole Flock Simulation");
//        simulate(flockOfDucks);
//
//        System.out.println("\nDuck Simulator: Mallard Flock Simulation");
//        simulate(flockOfMallards);
//
//        System.out.println("\nThe ducks quacked " + QuackCounter.getQuacks() +
//                " times");
//    }
//
//    void simulate(Quackable duck) {
//        duck.quack();
//    }
//}