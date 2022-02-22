package com.andersen.pre_intensive.patterns.marat.structural.adapter.russia.competitions;

import com.andersen.pre_intensive.patterns.marat.structural.adapter.Athlete;
import com.andersen.pre_intensive.patterns.marat.structural.adapter.usa.competitions.USAMedals;
import com.andersen.pre_intensive.patterns.marat.structural.adapter.usa.competitions.USANationals;

import java.util.Map;

public class USANationalsAdapter extends RussiaNationals {

    public USANationalsAdapter(USANationals nationals) {
        RussiaAwarders awarders = usaAwarders(nationals.seniorMedalists());
        setMasters(awarders);
        awarders = usaAwarders(nationals.noviceMedalists());
        setCandidatesToMasters(awarders);
    }

    private RussiaAwarders usaAwarders(Map<String, Athlete> medalists) {
        Athlete first = medalists.get(USAMedals.GOLD.name());
        Athlete second = medalists.get(USAMedals.SILVER.name());
        Athlete third = medalists.get(USAMedals.BRONZE.name());
        return new RussiaAwarders(first, second, third);
    }

    @Override
    public Map<String, String> mastersAwarders() {
        return super.mastersAwarders();
    }

    @Override
    public Map<String, String> candidatesToMastersAwarders() {
        return super.candidatesToMastersAwarders();
    }
}
