package design_patterns_theory.Behavioral.strategy;

public class DailyPayment implements PaymentMethod {
   @Override
   public void pay(double amount) {
      System.out.println("Paid daily");
   }
}