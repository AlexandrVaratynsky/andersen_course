package com.andersen.pre_intensive.patterns.alexandr.command;

import java.util.Arrays;
import java.util.List;

public class RemoteControl {
    boolean lightTurnedOn = false;
    boolean heaterTurnedOn = false;

    private static final int  LIGHT_ON = 0;
    private static final int HEATER_ON = 1;
    private List<Command> buttons;

    public RemoteControl(){
        buttons = Arrays.asList(
                new LightCommand(new Light()),
                new HeaterCommand(new Heater()));
    }

    public void buttonPress(int numButton){
        buttons.get(numButton).execute();
    }
    public void LightOn(){
        buttonPress(LIGHT_ON);
        lightTurnedOn = true;
    }
    public void HeaterOn(){
        buttonPress(HEATER_ON);
        heaterTurnedOn = true;
    }
}
