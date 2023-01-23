package design_patterns_theory.Behavioral.strategy;

public class Context {
   private PaymentMethod paymentMethod;

   public Context(PaymentMethod paymentMethod){
      this.paymentMethod = paymentMethod;
   }

   public  void setStrategy(PaymentMethod paymentMethod){
      this.paymentMethod = paymentMethod;
   }

   public void executeStrategy(double amount){
      paymentMethod.pay(amount);
   }
}