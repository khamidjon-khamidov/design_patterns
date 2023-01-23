package head_first_design_patterns.command.commands;

import head_first_design_patterns.command.general.Command;
import head_first_design_patterns.command.devices.GarageDoor;

public class GarageDoorCloseCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.close();
    }

    @Override
    public void undo() {
        garageDoor.open();
    }
}
