package head_first_design_patterns.command.commands;

import head_first_design_patterns.command.general.Command;

public class NoCommand implements Command {

    @Override
    public void execute() {
        System.out.println("No command.");
    }

    @Override
    public void undo() {
        System.out.println("Nothing done. No command.");
    }
}
