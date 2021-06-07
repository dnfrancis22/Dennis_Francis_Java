package com.company;

public class Warrior extends Character {

    //    warrior specific instance variables
    private int shieldStrength;

    public int getShieldStrength() {
        return shieldStrength;
    }

    //    warrior specific abilities
    public void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }


    // Warrior specific abilities
    public void decreaseShieldStrength() {
        System.out.println("My Shield Strength can decrease");
    }

}
