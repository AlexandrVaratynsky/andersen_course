package com.andersen.pre_intensive.patterns.marat.creational.singleton;

import org.junit.Before;
import org.junit.Test;

import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

public class OlympicChampionTest {
    private String firstName;
    private String lastName;

    @Before
    public void setUp(){
        firstName = "Alexei";
        lastName = "Yagudin";
    }

    @Test
    public void getInstance() {
        OlympicChampion champion = OlympicChampion.getInstance(firstName, lastName);
        IntStream.range(0, 100)
                .forEach(i -> OlympicChampion.getInstance(firstName + i, lastName + i));
        champion = OlympicChampion.getInstance(firstName + firstName, lastName + lastName);
        assertThat(champion.getFirstName() + champion.getLastName())
                .isEqualTo(firstName + lastName);
    }
}