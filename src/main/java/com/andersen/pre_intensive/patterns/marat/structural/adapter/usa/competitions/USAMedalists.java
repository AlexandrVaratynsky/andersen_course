package com.andersen.pre_intensive.patterns.marat.structural.adapter.usa.competitions;

import com.andersen.pre_intensive.patterns.marat.structural.adapter.Athlete;

import java.util.HashMap;
import java.util.Map;

public class USAMedalists {
    private final Athlete gold;
    private final Athlete silver;
    private final Athlete bronse;
    private final Athlete pewter;

    public USAMedalists(Athlete gold, Athlete silver, Athlete bronse, Athlete pewter) {
        this.gold = gold;
        this.silver = silver;
        this.bronse = bronse;
        this.pewter = pewter;
    }

    public Map<String, Athlete> medalists() {
        Map<String, Athlete> medalists = new HashMap<>();
        medalists.put(USAMedals.GOLD.name(), gold);
        medalists.put(USAMedals.SILVER.name(), silver);
        medalists.put(USAMedals.BRONZE.name(), bronse);
        medalists.put(USAMedals.PEWTER.name(), pewter);
        return medalists;
    }
}
