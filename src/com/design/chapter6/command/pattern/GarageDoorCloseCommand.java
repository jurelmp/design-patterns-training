package com.design.chapter6.command.pattern;

/**
 * Created by JurelP on 4/10/2016.
 */
public class GarageDoorCloseCommand implements Command {
    private GarageDoor garageDoor;

    GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }
}
