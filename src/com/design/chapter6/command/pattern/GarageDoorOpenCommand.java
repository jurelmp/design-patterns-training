package com.design.chapter6.command.pattern;

/**
 * Created by JurelP on 4/10/2016.
 */
public class GarageDoorOpenCommand implements Command {
    private GarageDoor garageDoor;

    GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}
