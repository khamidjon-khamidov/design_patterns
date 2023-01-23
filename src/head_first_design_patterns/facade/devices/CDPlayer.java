package head_first_design_patterns.facade.devices;

public class CDPlayer {
    Amplifier amplifier;

    public void on(){
        System.out.println("CD player is on");
    }

    public void off(){
        System.out.println("CD player is off");
    }

    public void eject(){
        System.out.println("CD player ejected");
    }

    public void pause(){
        System.out.println("CD player paused");
    }

    public void play(){
        System.out.println("CD player is playing");
    }

    public void stop(){
        System.out.println("CD player stopped");
    }
}
