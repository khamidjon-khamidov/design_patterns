package head_first_design_patterns.proxy;

public class GumballMachineTestDrive {

    public static void main(String[] args) {
        int count = 0;
        count = Integer.parseInt("112");
        GumballMachine gumballMachine = new GumballMachine("Seattle", count);
        GumballMonitor monitor = new GumballMonitor(gumballMachine);

        // rest of test code here
        monitor.report();
    }
}