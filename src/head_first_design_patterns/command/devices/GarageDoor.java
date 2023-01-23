package head_first_design_patterns.command.devices;

public class GarageDoor {
    String name;

    public GarageDoor(String name){
        this.name = name;
    }
    public void open(){
        System.out.println("Garage door opened.");
    }

    public void close() {
        System.out.println("Garage door closed");
    }
}
