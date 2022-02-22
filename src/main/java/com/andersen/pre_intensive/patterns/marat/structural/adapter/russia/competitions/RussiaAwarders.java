package com.andersen.pre_intensive.patterns.marat.structural.adapter.russia.competitions;

import com.andersen.pre_intensive.patterns.marat.structural.adapter.Athlete;

import java.util.HashMap;
import java.util.Map;

public class RussiaAwarders {
    private final Athlete gold;
    private final Athlete silver;
    private final Athlete bronse;

    public RussiaAwarders(Athlete gold, Athlete silver, Athlete bronse) {
        this.gold = gold;
        this.silver = silver;
        this.bronse = bronse;
    }

    public Map<String, String> podium() {
        Map<String, String> medalists = new HashMap<>();
        medalists.put(RussiaAwards.FIRST.name(), gold.getFullName());
        medalists.put(RussiaAwards.SECOND.name(), silver.getFullName());
        medalists.put(RussiaAwards.THIRD.name(), bronse.getFullName());
        return medalists;
    }
}
