package design_patterns_theory.Behavioral.command.commands;

import design_patterns_theory.Behavioral.command.receiver.Light;

class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }
}