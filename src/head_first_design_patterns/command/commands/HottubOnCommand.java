package head_first_design_patterns.command.commands;

import head_first_design_patterns.command.devices.Hottub;
import head_first_design_patterns.command.general.Command;

public class HottubOnCommand implements Command {
    Hottub hottub;

    public HottubOnCommand(Hottub hottub){
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.on();
    }

    @Override
    public void undo() {
        hottub.off();
    }
}
