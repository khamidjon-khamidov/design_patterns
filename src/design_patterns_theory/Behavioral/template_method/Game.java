package design_patterns_theory.Behavioral.template_method;


// In Template pattern, an abstract class exposes defined
// way(s)/template(s) to execute its methods. Its subclasses
// can override the method implementation as per need but the
// invocation is to be in the same way as defined by an abstract
// class. This pattern comes under behavior pattern category.
public abstract class Game {
   abstract void initialize();
   abstract void startPlay();
   abstract void endPlay();

   //template method
   public final void play(){

      //initialize the game
      initialize();

      //start game
      startPlay();

      //end game
      endPlay();
   }
}