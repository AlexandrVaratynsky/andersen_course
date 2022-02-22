package com.andersen.pre_intensive.patterns.alexandr.command;

public class LightCommand implements Command{
    private Light light;

    public LightCommand(Light light) {
        this.light = light;
    }

    @Override
    public String execute() {
        return light.turnOn();
    }
}
