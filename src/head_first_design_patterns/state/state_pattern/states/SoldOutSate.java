package head_first_design_patterns.state.state_pattern.states;

import head_first_design_patterns.state.state_pattern.GumballMachine;
import head_first_design_patterns.state.state_pattern.State;

public class SoldOutSate implements State {
    GumballMachine gumballMachine;

    public SoldOutSate(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can’t insert a quarter, the machine is sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You can't eject, you haven't inserted a quarter yet.");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned, but there are no gumballs");
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
