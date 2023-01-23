package head_first_design_patterns.facade.devices;

public class TheatreLights {

    public void on(){
        System.out.println("TheatreLights is on");
    }

    public void off(){
        System.out.println("TheatreLights is off");
    }

    public void dim(int level){
        System.out.println("TheatreLights dimmed to " + level);
    }
}
