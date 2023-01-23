package design_patterns_theory.Behavioral.mediator.users;

public abstract class Participant {
      public abstract void sendMsg(String msg);  
      public abstract void setName(String name);
      public abstract String getName();  
}