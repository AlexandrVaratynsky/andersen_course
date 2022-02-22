package com.andersen.pre_intensive.patterns.alexandr.command;

public class HeaterCommand implements Command {
    private Heater heater;

    public HeaterCommand(Heater heater) {
        this.heater = heater;
    }

    @Override
    public String execute() {
        return heater.makeItHot();
    }
}
