package head_first_design_patterns.command.commands;

import head_first_design_patterns.command.general.Command;
import head_first_design_patterns.command.devices.Stereo;

public class StereoOffWithCDCommand implements Command {
    Stereo stereo;

    public StereoOffWithCDCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }
}
