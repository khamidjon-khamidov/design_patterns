package head_first_design_patterns.proxy;

public abstract class State {

    public abstract void insertQuarter();

    public abstract void ejectQuarter();

    public abstract void turnCrank();

    public abstract void dispense();

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
