package head_first_design_patterns.command.general;

import head_first_design_patterns.command.general.Command;

public class MacroCommand implements Command {
    Command[] commands;

    public MacroCommand(Command[] commands){
        this.commands = commands;
    }

    @Override
    public void execute() {
        for(int i = 0; i < commands.length; i++){
            commands[i].execute();
        }
    }

    @Override
    public void undo() {
        for(int i = 0; i < commands.length; i++){
            commands[i].undo();
        }
    }
}
