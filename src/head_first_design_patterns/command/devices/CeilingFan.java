package head_first_design_patterns.command.devices;

public class CeilingFan {
    public static final int OFF = 0;
    public static final int LOW = 1;
    public static final int MEDIUM = 2;
    public static final int HIGH = 3;

    int speed;
    String location;

    public CeilingFan(String location){
        this.location = location;
        speed = OFF;
    }

    public void on(){
        speed = LOW;
        System.out.println(location + " Ceiling Fan is on");
    }

    public void off() {
        speed = HIGH;
        System.out.println(location + "Ceiling Fan is off");
    }

    public void high(){
        speed = HIGH;
    }

    public void medium(){
        speed = MEDIUM;
    }

    public void low(){
        speed = LOW;
    }

    public int getSpeed(){
        return speed;
    }
}












