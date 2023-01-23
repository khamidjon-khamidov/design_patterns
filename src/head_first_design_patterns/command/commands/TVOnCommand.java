package head_first_design_patterns.command.commands;

import head_first_design_patterns.command.general.Command;
import head_first_design_patterns.command.devices.TV;

public class TVOnCommand implements Command {
    TV tv;

    public TVOnCommand(TV tv){
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.off();
    }
}
