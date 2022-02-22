package com.andersen.pre_intensive.patterns.marat.creational.singleton;

public class OlympicChampion {
    private static OlympicChampion instance;
    private final String firstName;
    private final String lastName;

    private OlympicChampion(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static OlympicChampion getInstance(String firstName, String lastName){
        if(instance ==null){
            instance = new OlympicChampion(firstName,lastName);
        }
        return instance;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
