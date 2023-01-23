package head_first_design_patterns.command.commands;

import head_first_design_patterns.command.general.Command;
import head_first_design_patterns.command.devices.Light;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
