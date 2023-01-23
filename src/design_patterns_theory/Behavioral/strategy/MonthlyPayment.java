package design_patterns_theory.Behavioral.strategy;

public class MonthlyPayment implements PaymentMethod {
   @Override
   public void pay(double amount) {
      System.out.println("Paid Monthly");
   }
}