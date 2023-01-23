package head_first_design_patterns.command.devices;

public class Stereo {
    String roomName;

    public Stereo(String roomName){
        this.roomName = roomName;
    }

    public void on() {
        System.out.println(roomName + "Stereo is on");
    }

    public void setCD() {
        System.out.println(roomName + "CD is set");
    }

    public void setVolume(int volume) {
        System.out.println(roomName + "Volume set to " + volume);
    }

    public void setRadio() {
        System.out.println(roomName + "Radio set to ");
    }

    public void off() {
        System.out.println(roomName + "Stereo is off");
    }
}
