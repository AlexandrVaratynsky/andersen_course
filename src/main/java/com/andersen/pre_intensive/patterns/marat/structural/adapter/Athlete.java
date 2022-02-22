package com.andersen.pre_intensive.patterns.marat.structural.adapter;

public class Athlete {
    private final String firstname;
    private final String lastname;

    public Athlete(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFullName(){
        return firstname + lastname;
    }
}
