package design_patterns_theory.Behavioral.observer.observers;

import design_patterns_theory.Behavioral.observer.Subject;

public class BinaryObserver extends Observer {

   public BinaryObserver(Subject subject){
      this.subject = subject;
      this.subject.attach(this);
   }

   @Override
   public void update() {
      System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ) ); 
   }
}