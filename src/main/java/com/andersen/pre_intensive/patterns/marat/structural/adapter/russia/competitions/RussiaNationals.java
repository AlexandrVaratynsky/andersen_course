package com.andersen.pre_intensive.patterns.marat.structural.adapter.russia.competitions;

import java.util.Map;


public class RussiaNationals {
    private RussiaAwarders masters;
    private RussiaAwarders candidatesToMasters;

    public RussiaNationals(RussiaAwarders masters, RussiaAwarders candidatesToMasters) {
        this.masters = masters;
        this.candidatesToMasters = candidatesToMasters;
    }

    public RussiaAwarders getMasters() {
        return masters;
    }

    public RussiaAwarders getCandidatesToMasters() {
        return candidatesToMasters;
    }

    public RussiaNationals() {
    }

    public void setMasters(RussiaAwarders masters) {
        this.masters = masters;
    }

    public void setCandidatesToMasters(RussiaAwarders candidatesToMasters) {
        this.candidatesToMasters = candidatesToMasters;
    }

    public Map<String, String> mastersAwarders() {
        return masters.podium();
    }

    public Map<String, String> candidatesToMastersAwarders() {
        return candidatesToMasters.podium();
    }
}
