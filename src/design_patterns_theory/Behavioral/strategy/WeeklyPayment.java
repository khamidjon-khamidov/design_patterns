package design_patterns_theory.Behavioral.strategy;

public class WeeklyPayment implements PaymentMethod {
   @Override
   public void pay(double amount) {
      System.out.println("Paid weekly");
   }
}