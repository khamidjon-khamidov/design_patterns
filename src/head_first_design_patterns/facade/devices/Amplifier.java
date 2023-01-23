package head_first_design_patterns.facade.devices;

public class Amplifier {
    Tuner tuner;
    DvdPlayer dvdPlayer;
    CDPlayer cdPlayer;

    public Amplifier(){}

    public void on(){
        System.out.println("Amplifier is on");
    }

    public void off(){
        System.out.println("Amplifier is of");
    }

    public void setCD(){
        System.out.println("Amplifier CD set");
    }

    public void setDvd(DvdPlayer dvdPlayer){
        System.out.println("Amplifier DVD set");
        this.dvdPlayer = dvdPlayer;
    }

    public void setStereoSound(){
        System.out.println("Amplifier Stereo sound set");
    }

    public void setSurroundSound(){
        System.out.println("Amplifier Surround sound set");
    }

    public void setTuner(){
        System.out.println("Amplifier Tuner set");
    }

    public void setVolume(int volume){
        System.out.println("Amplifier Volume set to volume " + volume);
    }
}
