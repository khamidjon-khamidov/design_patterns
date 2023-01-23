import design_patterns_theory.Behavioral.chain_of_responsibility.AbstractLogger;
import design_patterns_theory.Behavioral.chain_of_responsibility.ConsoleLogger;
import design_patterns_theory.Behavioral.chain_of_responsibility.ErrorLogger;
import design_patterns_theory.Behavioral.chain_of_responsibility.FileLogger;
import design_patterns_theory.Behavioral.command.SimpleRemoteControl;
import design_patterns_theory.Behavioral.command.commands.LightOnCommand;
import design_patterns_theory.Behavioral.command.commands.StereoOffCommand;
import design_patterns_theory.Behavioral.command.commands.StereoOnWithCDCommand;
import design_patterns_theory.Behavioral.command.receiver.Light;
import design_patterns_theory.Behavioral.command.receiver.Stereo;
import design_patterns_theory.Behavioral.interpreter.AndExpression;
import design_patterns_theory.Behavioral.interpreter.Expression;
import design_patterns_theory.Behavioral.interpreter.OrExpression;
import design_patterns_theory.Behavioral.interpreter.TerminalExpression;
import design_patterns_theory.Behavioral.iterator.Iterator;
import design_patterns_theory.Behavioral.iterator.NameRepository;
import design_patterns_theory.Behavioral.mediator.ApnaChatRoom;
import design_patterns_theory.Behavioral.mediator.ApnaChatRoomImpl;
import design_patterns_theory.Behavioral.mediator.users.User1;
import design_patterns_theory.Behavioral.mediator.users.User2;
import design_patterns_theory.Behavioral.memento.CareTaker;
import design_patterns_theory.Behavioral.memento.Originator;
import design_patterns_theory.Behavioral.observer.observers.BinaryObserver;
import design_patterns_theory.Behavioral.observer.observers.HexaObserver;
import design_patterns_theory.Behavioral.observer.observers.OctalObserver;
import design_patterns_theory.Behavioral.observer.Subject;
import design_patterns_theory.Behavioral.state.Context;
import design_patterns_theory.Behavioral.state.StartState;
import design_patterns_theory.Behavioral.state.StopState;
import design_patterns_theory.Behavioral.strategy.MonthlyPayment;
import design_patterns_theory.Behavioral.strategy.DailyPayment;
import design_patterns_theory.Behavioral.strategy.WeeklyPayment;
import design_patterns_theory.Behavioral.template_method.Cricket;
import design_patterns_theory.Behavioral.template_method.Football;
import design_patterns_theory.Behavioral.template_method.Game;
import design_patterns_theory.Behavioral.visitor.ComputerPartDisplayVisitor;
import design_patterns_theory.Behavioral.visitor.computer_parts.Computer;
import design_patterns_theory.Behavioral.visitor.computer_parts.ComputerPart;
import design_patterns_theory.Creational.abstract_factory.AbstractFactory;
import design_patterns_theory.Creational.abstract_factory.FactoryProducer;
import design_patterns_theory.Creational.abstract_factory.shapes.Shape;
import design_patterns_theory.Creational.builder.Meal;
import design_patterns_theory.Creational.builder.MealBuilder;
import design_patterns_theory.Creational.factory_method.GetPlanFactory;
import design_patterns_theory.Creational.factory_method.plan.Plan;
import design_patterns_theory.Creational.prototype.EmployeeRecord;
import design_patterns_theory.Creational.singleton.SingleObject;
import design_patterns_theory.Structural.adapter.BankCustomer;
import design_patterns_theory.Structural.adapter.CreditCard;
import design_patterns_theory.Structural.bridge.Vehicle;
import design_patterns_theory.Structural.bridge.workshops.Assemble;
import design_patterns_theory.Structural.bridge.workshops.Produce;
import design_patterns_theory.Structural.bridge.vehicles.Bike;
import design_patterns_theory.Structural.bridge.vehicles.Car;
import design_patterns_theory.Structural.composite.CompanyDirectory;
import design_patterns_theory.Structural.composite.component.Developer;
import design_patterns_theory.Structural.composite.component.Manager;
import design_patterns_theory.Structural.decorator.RedShapeDecorator;
import design_patterns_theory.Structural.decorator.shapes.Circle;
import design_patterns_theory.Structural.decorator.shapes.Rectangle;
import design_patterns_theory.Structural.facade.HotelKeeper;
import design_patterns_theory.Structural.facade.menu.Both;
import design_patterns_theory.Structural.facade.menu.NonVegMenu;
import design_patterns_theory.Structural.facade.menu.VegMenu;
import design_patterns_theory.Structural.flyweight.ShapeFactory;
import design_patterns_theory.Structural.proxy.Image;
import design_patterns_theory.Structural.proxy.ProxyImage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Builder();
    }

    // region design_patterns_theory.Creational
    public static void AbstractFactory() {
        //get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        //get an object of Shape Rectangle
        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        //call draw method of Shape Rectangle
        shape1.draw();
        //get an object of Shape Square
        Shape shape2 = shapeFactory.getShape("SQUARE");
        //call draw method of Shape Square
        shape2.draw(); 
        //get shape factory
        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
        //get an object of Shape Rectangle
        Shape shape3 = shapeFactory1.getShape("RECTANGLE");
        //call draw method of Shape Rectangle
        shape3.draw();
        //get an object of Shape Square
        Shape shape4 = shapeFactory1.getShape("SQUARE");
        //call draw method of Shape Square
        shape4.draw();

    }
    public static void Builder() {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());

    }

    public static void FactoryMethod() throws IOException {
        GetPlanFactory planFactory = new GetPlanFactory();

        System.out.print("Enter the name of plan for which the bill will be generated: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String planName = br.readLine();
        System.out.print("Enter the number of units for bill will be calculated: ");
        int units = Integer.parseInt(br.readLine());

        Plan p = planFactory.getPlan(planName);
        //call getRate() method and calculateBill()method of DomesticPlan.

        System.out.print("Bill amount for " + planName + " of  " + units + " units is: ");
        p.getRate();
        p.calculateBill(units);
    }

    public static void Prototype() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Employee Id: ");
        int eid = Integer.parseInt(br.readLine());
        System.out.print("\n");

        System.out.print("Enter Employee Name: ");
        String ename = br.readLine();
        System.out.print("\n");

        System.out.print("Enter Employee Designation: ");
        String edesignation = br.readLine();
        System.out.print("\n");

        System.out.print("Enter Employee Address: ");
        String eaddress = br.readLine();
        System.out.print("\n");

        System.out.print("Enter Employee Salary: ");
        double esalary = Double.parseDouble(br.readLine());
        System.out.print("\n");

        EmployeeRecord e1 = new EmployeeRecord(eid, ename, edesignation, esalary, eaddress);

        e1.showRecord();
        System.out.println("\n");
        EmployeeRecord e2 = (EmployeeRecord) e1.getClone();
        e2.showRecord();
    }

    public static void Singleton() {
        SingleObject object = SingleObject.getInstance();
        object.showMessage();
    }
    // endregion

    // region design_patterns_theory.Structural
    public static void Adapter() {
        CreditCard targetInterface = new BankCustomer();
        targetInterface.giveBankDetails();
        System.out.print(targetInterface.getCreditCard());
    }

    public static void Bridge() {
        Vehicle vehicle1 = new Car(new Produce(), new Assemble());
        vehicle1.manufacture();
        Vehicle vehicle2 = new Bike(new Produce(), new Assemble());
        vehicle2.manufacture();
    }

    public static void Composite() {
        Developer dev1 = new Developer(100, "Lokesh Sharma", "Pro Developer");
        Developer dev2 = new Developer(101, "Vinay Sharma", "Developer");
        CompanyDirectory engDirectory = new CompanyDirectory();
        engDirectory.addEmployee(dev1);
        engDirectory.addEmployee(dev2);

        Manager man1 = new Manager(200, "Kushagra Garg", "SEO Manager");
        Manager man2 = new Manager(201, "Vikram Sharma ", "Kushagra's Manager");

        CompanyDirectory accDirectory = new CompanyDirectory();
        accDirectory.addEmployee(man1);
        accDirectory.addEmployee(man2);

        CompanyDirectory directory = new CompanyDirectory();
        directory.addEmployee(engDirectory);
        directory.addEmployee(accDirectory);
        directory.showEmployeeDetails();
    }

    public static void Decorator() {
        // inside the main() method
        design_patterns_theory.Structural.decorator.shapes.Shape circle = new Circle();

        design_patterns_theory.Structural.decorator.shapes.Shape redCircle = new RedShapeDecorator(new Circle());

        design_patterns_theory.Structural.decorator.shapes.Shape redRectangle = new RedShapeDecorator(new Rectangle());

        // Display message
        System.out.println("Circle with normal border");

        // Calling the draw method over the
        // object calls as created in
        // above classes

        // Call 1
        circle.draw();

        // Display message
        System.out.println("\nCircle of red border");

        // Call 2
        redCircle.draw();

        // Display message
        System.out.println("\nRectangle of red border");

        // Call 3
        redRectangle.draw();
    }

    public static void Facade() {
        HotelKeeper keeper = new HotelKeeper();

        VegMenu v = keeper.getVegMenu();
        NonVegMenu nv = keeper.getNonVegMenu();
        Both both = keeper.getVegNonMenu();
    }

    public static void FlyWeight() {
        for (int i = 0; i < 20; ++i) {
            design_patterns_theory.Structural.flyweight.shape.Circle circle = (design_patterns_theory.Structural.flyweight.shape.Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    public static void Proxy() {
        Image image = new ProxyImage("test_10mb.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println("");

        //image will not be loaded from disk
        image.display();
    }
    // endregion

    // region design_patterns_theory.Behavioral
    public static void ChainOfResponsibility() {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");

        loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level information.");

        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
    }

    public static void Command() {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        Stereo stereo = new Stereo();

        // we can change command dynamically
        remote.setCommand(new LightOnCommand(light));
        remote.buttonWasPressed();
        remote.setCommand(new StereoOnWithCDCommand(stereo));
        remote.buttonWasPressed();
        remote.setCommand(new StereoOffCommand(stereo));
        remote.buttonWasPressed();
    }

    public static void Interpreter() {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));
    }

    public static void Iterator() {
        NameRepository namesRepository = new NameRepository();

        for (Iterator iter = namesRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }
    }

    public static void Mediator() {
        ApnaChatRoom chat = new ApnaChatRoomImpl();

        User1 u1=new User1(chat);
        u1.setName("Ashwani Rajput");
        u1.sendMsg("Hi Ashwani! how are you?");


        User2 u2=new User2(chat);
        u2.setName("Soono Jaiswal");
        u2.sendMsg("I am Fine ! You tell?");
    }

    public static void Memento() {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #4");
        System.out.println("Current State: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
    }

    public static void Observer() {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }

    public static void State() {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }

    public static void Strategy() {
        design_patterns_theory.Behavioral.strategy.Context context = new design_patterns_theory.Behavioral.strategy.Context(new MonthlyPayment());
        context.executeStrategy(10);

        context.setStrategy(new WeeklyPayment());
        context.executeStrategy(10);

        context.setStrategy(new DailyPayment());
        context.executeStrategy(10);
    }

    public static void TemplateMethod() {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }

    public static void Visitor() {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
    // endregion

    // region Utility Methods
    //Rule: Robert and John are male
    private static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    //Rule: Julie is a married women
    private static Expression getMarriedWomanExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    private static AbstractLogger getChainOfLoggers() {

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    private static String getRandomColor() {
        String[] colors = {"Red", "Green", "Blue", "White", "Black"};
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
    // endregion

}
