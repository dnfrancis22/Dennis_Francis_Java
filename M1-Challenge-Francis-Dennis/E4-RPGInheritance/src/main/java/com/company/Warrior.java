package com.company;

public class Warrior extends Character {
    public Warrior(String name, int strength, int health, int stamina, int speed, int attackPower, int shieldStrength) {
        super(name, strength, health, stamina, speed, attackPower);
        this.shieldStrength = shieldStrength;
    }

    //    warrior specific instance variables
    private int shieldStrength;

    //    getters and setters
    public int getShieldStrength() {
        return shieldStrength;
    }

    public void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }


    // Warrior specific abilities
    public void warriorSpecificGreet() {
        System.out.println("And the strength of my shield is " + shieldStrength);
    }

    public void decreaseShieldStrength() {
        System.out.println("My Shield Strength can decrease");
    }

}
