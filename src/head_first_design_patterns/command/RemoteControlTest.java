package head_first_design_patterns.command;

import head_first_design_patterns.command.commands.GarageDoorOpenCommand;
import head_first_design_patterns.command.commands.LightOnCommand;
import head_first_design_patterns.command.devices.GarageDoor;
import head_first_design_patterns.command.devices.Light;

public class RemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();

        Light light = new Light("Living room");
        GarageDoor garageDoor = new GarageDoor("");

        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garageDoorOpen);
        remote.buttonWasPressed();
    }
}