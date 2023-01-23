package design_patterns_theory.Structural.bridge;

import design_patterns_theory.Structural.bridge.workshops.Workshop;

// ** The Bridge design pattern allows you to separate the
// abstraction from the implementation. It is a structural design pattern.
//
//** There are 2 parts in Bridge design pattern:
// 1. Abstraction
// 2. Implementation
//
// ** This is a design mechanism that encapsulates an implementation class inside an interface class.
//  1. The bridge pattern allows the Abstraction and the
//  Implementation to be developed independently and the
//  client code can access only the Abstraction part without
//  being concerned about the Implementation part.
//  2. The abstraction is an interface or abstract class and
//  the implementer is also an interface or abstract class.
//  3. The abstraction contains a reference to the implementer.
//  Children of the abstraction are referred to as refined
//  abstractions, and children of the implementer are concrete
//  implementers. Since we can change the reference to the
//  implementer in the abstraction, we are able to change the
//  abstraction’s implementer at run-time. Changes to the
//  implementer do not affect client code.
//  4. It increases the loose coupling between class abstraction,
//  and it’s implementation.
//
// ** Elements of Bridge Design Pattern
//  1.Abstraction – core of the bridge design pattern and defines
//  the crux. Contains a reference to the implementer.
//  2. Refined Abstraction – Extends the abstraction takes the finer
//  detail one level below. Hides the finer elements from implementors.
//  3. Implementer – It defines the interface for implementation classes.
//  This interface does not need to correspond directly to the abstraction
//  interface and can be very different. Abstraction imp provides an
//  implementation in terms of operations provided by the Implementer interface.
//  4. Concrete Implementation – Implements the above implementer by
//  providing the concrete implementation.


public abstract class Vehicle {
    protected Workshop workShop1;
    protected Workshop workShop2;
 
    protected Vehicle(Workshop workShop1, Workshop workShop2)
    {
        this.workShop1 = workShop1;
        this.workShop2 = workShop2;
    }
 
    abstract public void manufacture();
}