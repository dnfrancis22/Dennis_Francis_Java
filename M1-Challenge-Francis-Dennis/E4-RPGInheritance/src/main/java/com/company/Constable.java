package com.company;

public class Constable extends Character {
    public Constable(String name, int strength, int health, int stamina, int speed, int attackPower, String jurisdiction) {
        super(name, strength, health, stamina, speed, attackPower);
        this.jurisdiction = jurisdiction;
    }

    //    Constable specific instance variables
    private String jurisdiction;

    //    getters and setters
    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    //    Constable specific Abilities
    public void specificGreet() {
        System.out.println("And my jurisdiction is " + jurisdiction);
    }

    public void arrest() {
        System.out.println("I can arrest someone");
    }
}
