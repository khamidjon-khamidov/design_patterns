package design_patterns_theory.Behavioral.observer.observers;

import design_patterns_theory.Behavioral.observer.Subject;

public class OctalObserver extends Observer {

   public OctalObserver(Subject subject){
      this.subject = subject;
      this.subject.attach(this);
   }

   @Override
   public void update() {
     System.out.println( "Octal String: " + Integer.toOctalString( subject.getState() ) ); 
   }
}