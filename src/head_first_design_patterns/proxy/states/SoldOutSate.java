package head_first_design_patterns.proxy.states;

import head_first_design_patterns.proxy.GumballMachine;
import head_first_design_patterns.proxy.State;


public class SoldOutSate extends State {
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
