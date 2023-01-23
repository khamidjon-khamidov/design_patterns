package design_patterns_theory.Structural.bridge.workshops;

public class Produce implements Workshop {
    @Override
    public void work()
    {
        System.out.print("Produced");
    }
}