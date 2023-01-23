package head_first_design_patterns.command.devices;

public class Hottub {
    String location;

    public Hottub(String location){
        this.location = location;
    }

    public void on(){
        System.out.println("Hottub is on in " + location);
    }

    public void off(){
        System.out.println("Hottub is off in " + location);
    }
}
