package com.design.chapter6.command.pattern;

/**
 * Created by JurelP on 4/10/2016.
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
