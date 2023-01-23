package design_patterns_theory.Behavioral.command.commands;

import design_patterns_theory.Behavioral.command.receiver.Light;

public class LightOnCommand implements Command {
    Light light;

    // The constructor is passed the light it
    // is going to control.
    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }
}