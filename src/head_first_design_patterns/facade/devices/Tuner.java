package head_first_design_patterns.facade.devices;

public class Tuner {
    Amplifier amplifier;

    public Tuner(){}

    public void on(){
        System.out.println("Tuner is on");
    }

    public void off(){
        System.out.println("Tuner is off");
    }

    public void setAm(){
        System.out.println("Tuner AM set");
    }

    public void setFm(){
        System.out.println("Tuner FM set");
    }

    public void setFrequency(){
        System.out.println("Tuner frequency set");
    }
}
