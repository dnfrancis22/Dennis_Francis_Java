package com.company;

public class Constable {

    //    Constable specific instance variables
    private String jurisdiction;

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    //    Constable specific Abilities
    public void arrest() {
        System.out.println("I can arrest someone");
    }
}
