package design_patterns_theory.Behavioral.observer.observers;

import design_patterns_theory.Behavioral.observer.Subject;

public class HexaObserver extends Observer {

   public HexaObserver(Subject subject){
      this.subject = subject;
      this.subject.attach(this);
   }

   @Override
   public void update() {
      System.out.println( "Hex String: " + Integer.toHexString( subject.getState() ).toUpperCase() ); 
   }
}