package head_first_design_patterns.facade.devices;

public class Projector {
    DvdPlayer dvdPlayer;

    public Projector(){

    }

    public void on(){
        System.out.println("DVD Player is on");
    }

    public void off(){
        System.out.println("DVD Player is off");
    }

    public void tvMode(){
        System.out.println("DVD Player TV mode set");
    }

    public void wideScreenMode(){
        System.out.println("DVD Player wide screen mode set");
    }
}
