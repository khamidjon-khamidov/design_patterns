package head_first_design_patterns.command.devices;

public class Light {
    String roomName;

    public  Light(String name){
        this.roomName = name;
    }
    public  void on(){
        System.out.println(roomName + " Light is on");
    }

    public void off() {
        System.out.println(roomName + " Light is off");
    }
}
