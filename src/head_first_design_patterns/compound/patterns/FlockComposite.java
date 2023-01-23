//package head_first_design_patterns.compound.patterns;
//
//import head_first_design_patterns.compound.Quackable;
//
//import java.util.ArrayList;
//import java.util.Iterator;
//
//public class FlockComposite implements Quackable {
//    ArrayList<Quackable> quackers = new ArrayList<>();
//
//    public void add(Quackable quacker) {
//        quackers.add(quacker);
//    }
//
//    @Override
//    public void quack() {
//        Iterator<Quackable> iterator = quackers.iterator();
//        while (iterator.hasNext()){
//            Quackable quackable = iterator.next();
//            quackable.quack();
//        }
//    }
//}
