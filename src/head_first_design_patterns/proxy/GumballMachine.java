package head_first_design_patterns.proxy;


import head_first_design_patterns.proxy.states.*;

public class GumballMachine {

    final private State soldOutState;
    final private State noQuarterState;
    final private State hasQuarterState;
    final private State soldState;
    final private State winnerState;

    String location;

    private State state;
    private int count = 0;

    public GumballMachine(String location, int numberOfBalls) {
        this.location = location;

        soldOutState = new SoldOutSate(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        state = soldOutState;

        this.count = numberOfBalls;
        if (count > 0) {
            setState(noQuarterState);
        }
    }


    public String getLocation() {
        return location;
    }

    public void refill(int gumballCount){
        count = gumballCount;
        setState(noQuarterState);
    }

    public void setState(State state) {
        this.state = state;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count--;
        }
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public State getState() {
        return state;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "state=" + state +
                ", count=" + count +
                '}';
    }
}
