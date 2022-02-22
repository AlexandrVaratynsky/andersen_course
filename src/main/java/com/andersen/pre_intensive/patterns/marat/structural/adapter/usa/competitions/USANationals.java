package com.andersen.pre_intensive.patterns.marat.structural.adapter.usa.competitions;

import com.andersen.pre_intensive.patterns.marat.structural.adapter.Athlete;

import java.util.Map;


public class USANationals {
    private final USAMedalists seniors;
    private final USAMedalists novices;

    public USANationals(USAMedalists seniors, USAMedalists novices) {
        this.seniors = seniors;
        this.novices = novices;
    }

    public Map<String, Athlete> seniorMedalists() {
        return seniors.medalists();
    }

    public Map<String, Athlete> noviceMedalists() {
        return novices.medalists();
    }
}
