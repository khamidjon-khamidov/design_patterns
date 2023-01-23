package head_first_design_patterns.command.devices;

public class TV {

    String location;

    public TV(String location){
        this.location = location;
    }

    public void on(){
        System.out.println("TV is on in " + location);
    }

    public void off(){
        System.out.println("TV is off in " + location);
    }
}
