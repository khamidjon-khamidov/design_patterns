package design_patterns_theory.Creational.factory_method;

import design_patterns_theory.Creational.factory_method.plan.CommercialPlan;
import design_patterns_theory.Creational.factory_method.plan.DomesticPlan;
import design_patterns_theory.Creational.factory_method.plan.InstitutionalPlan;
import design_patterns_theory.Creational.factory_method.plan.Plan;


// ** A Factory Pattern or Factory Method Pattern says that just define an interface
// or abstract class for creating an object but let the subclasses decide which class to instantiate.
// In other words, subclasses are responsible to create the instance of the class.
//
// ** The Factory Method Pattern is also known as Virtual Constructor.
//
// ** Advantage of Factory Design Pattern
//  1. Factory Method Pattern allows the subclasses to choose the type of objects to create.
//  2. It promotes the loose-coupling by eliminating the need to bind application-specific classes into the code.
//     That means the code interacts solely with the resultant interface or abstract class, so that it will work with
//     any classes that implement that interface or that extends that abstract class.
// ** Usage of Factory Design Pattern
//  1. When a class doesn't know what subclasses will be required to create
//  2. When a class wants that its subclasses specify the objects to be created.
//  3. When the parent classes choose the creation of objects to its subclasses.
public class GetPlanFactory {

    public Plan getPlan(String planType){
        if(planType == null){
            return null;
        }
        if(planType.equalsIgnoreCase("DOMESTICPLAN")) {
            return new DomesticPlan();
        }
        else if(planType.equalsIgnoreCase("COMMERCIALPLAN")){
            return new CommercialPlan();
        }
        else if(planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
            return new InstitutionalPlan();
        }
        return null;
    }
}
