package design_patterns_theory.Structural.bridge.vehicles;

import design_patterns_theory.Structural.bridge.Vehicle;
import design_patterns_theory.Structural.bridge.workshops.Workshop;

public class Bike extends Vehicle {
    public Bike(Workshop workShop1, Workshop workShop2)
    {
        super(workShop1, workShop2);
    }
 
    @Override
    public void manufacture()
    {
        System.out.print("Bike ");
        workShop1.work();
        workShop2.work();
    }
}