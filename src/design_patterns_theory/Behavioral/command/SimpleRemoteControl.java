package design_patterns_theory.Behavioral.command;

import design_patterns_theory.Behavioral.command.commands.Command;


//  ** Suppose you are building a home automation system. There is a programmable
//  remote which can be used to turn on/off various items in your home like
//  lights, stereo, AC etc. It looks something like this.
//
//  ** You can do it with simple if-else statements like
//  if (buttonPressed == button1)
//      lights.on()
//
//  ** But we need to keep in mind that turning on some devices like stereo comprises
//  many steps like setting cd, volume etc. Also, we can reassign a button to do
//  something else. By using simple if-else we are coding to implementation
//  rather than interface. Also, there is tight coupling.
//
//  ** So what we want to achieve is a design that provides loose coupling and
//  remote control should not have much information about a particular device.
//  The command pattern helps us do that.
//
//  ** Definition: The command pattern encapsulates a request as an object,
//  thereby letting us parameterize other objects with different requests, queue
//  or log requests, and support undoable operations.
//
//  ** The definition is a bit confusing at first but let’s step through it.
//  In analogy to our problem above remote control is the client and stereo,
//  lights etc. are the receivers. In command pattern there is a Command
//  object that encapsulates a request by binding together a set of actions
//  on a specific receiver. It does so by exposing just one method execute()
//  that causes some actions to be invoked on the receiver.
//
//  ** Parameterizing other objects with different requests in our analogy
//  means that the button used to turn on the lights can later be used to turn
//  on stereo or maybe open the garage door.
//
//  ** Queue or log requests, and support undoable operations means that
//  Command’s Execute operation can store state for reversing its effects
//  in the Command itself. The Command may have an added unExecute operation
//  that reverses the effects of a previous call to execute.It may also
//  support logging changes so that they can be reapplied in case of a system crash.
public class SimpleRemoteControl {
    Command slot;  // only one button

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        // set the command the remote will
        // execute
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}