package com.andersen.pre_intensive.patterns.marat.creational.factory;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class EventTest {

    @Test
    public void russiaChampionship() {
        int perfectSpinnigBonuse = 4;
        Event event = new RussiaNationals();
        Rules rules = event.getRules();
        assertThat(rules.getSpinningPerfectExecutedBonuses())
                .isEqualTo(perfectSpinnigBonuse);
    }

    @Test
    public void usaChampionship() {
        int perfectSpinnigBonuse = 0;
        Event event = new USANationals();
        Rules rules = event.getRules();
        assertThat(rules.getSpinningPerfectExecutedBonuses())
                .isEqualTo(perfectSpinnigBonuse);
    }
}