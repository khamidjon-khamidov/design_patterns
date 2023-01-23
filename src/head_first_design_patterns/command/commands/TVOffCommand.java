package head_first_design_patterns.command.commands;

import head_first_design_patterns.command.general.Command;
import head_first_design_patterns.command.devices.TV;

public class TVOffCommand implements Command {
    TV tv;

    public TVOffCommand(TV tv){
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }
}
