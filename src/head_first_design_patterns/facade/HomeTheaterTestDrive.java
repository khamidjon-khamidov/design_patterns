package head_first_design_patterns.facade;

import head_first_design_patterns.facade.devices.*;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        // instantiate components here
        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner();
        DvdPlayer dvd = new DvdPlayer();
        CDPlayer cd = new CDPlayer();
        Projector projector = new Projector();
        Screen screen = new Screen();
        TheatreLights lights = new TheatreLights();
        PopcornPopper popper = new PopcornPopper();

        HomeTheaterFacade homeTheater =
                new HomeTheaterFacade(amp, tuner, dvd, cd,
                        projector, screen, lights, popper);

        homeTheater.watchMovie("Raiders of the Lost Ark");
        homeTheater.endMovie();
    }
}