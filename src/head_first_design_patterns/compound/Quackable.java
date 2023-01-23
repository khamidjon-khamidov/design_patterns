package head_first_design_patterns.compound;

import head_first_design_patterns.compound.patterns.QuackObservable;

public interface Quackable extends QuackObservable {
    public void quack();
}
