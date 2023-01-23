package design_patterns_theory.Behavioral.chain_of_responsibility;

// ** As the name suggests, the chain of responsibility pattern creates
// a chain of receiver objects for a request. This pattern decouples
// sender and receiver of a request based on type of request.
// This pattern comes under behavioral patterns.
//
// ** In this pattern, normally each receiver contains reference to
// another receiver. If one object cannot handle the request
// then it passes the same to the next receiver and so on.
public abstract class AbstractLogger {
   public static int INFO = 1;
   public static int DEBUG = 2;
   public static int ERROR = 3;

   protected int level;

   //next element in chain or responsibility
   protected AbstractLogger nextLogger;

   public void setNextLogger(AbstractLogger nextLogger){
      this.nextLogger = nextLogger;
   }

   public void logMessage(int level, String message){
      if(this.level <= level){
         write(message);
      }
      if(nextLogger !=null){
         nextLogger.logMessage(level, message);
      }
   }

   abstract protected void write(String message);
	
}