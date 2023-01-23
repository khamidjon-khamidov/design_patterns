package head_first_design_patterns.command.commands;

import head_first_design_patterns.command.devices.Hottub;
import head_first_design_patterns.command.general.Command;

public class HottubOffCommand implements Command {
    Hottub hottub;

    public HottubOffCommand(Hottub hottub){
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.off();
    }

    @Override
    public void undo() {
        hottub.on();
    }
}
