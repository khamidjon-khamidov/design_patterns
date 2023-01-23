package head_first_design_patterns.facade.devices;

public class DvdPlayer {
    Amplifier amplifier;

    public DvdPlayer(){}


    public void on(){
        System.out.println("DVD Player is on");
    }

    public void off(){
        System.out.println("DVD Player is off");
    }

    public void eject(){
        System.out.println("DVD Player ejected");
    }

    public void pause(){
        System.out.println("DVD Player paused");
    }

    public void play(String movie){
        System.out.println("DVD Player is playing " + movie);
    }

    public void setSurroundAudio(){
        System.out.println("DVD Player surround audio");
    }

    public void setTwoChannelAudio(){
        System.out.println("DVD Player two channel audio set");
    }

    public void stop(){
        System.out.println("DVD Player stopped");
    }
}
