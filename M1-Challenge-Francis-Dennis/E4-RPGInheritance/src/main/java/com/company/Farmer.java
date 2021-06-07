package com.company;

public class Farmer extends Character{
    public Farmer(String name, int strength, int health, int stamina, int speed, int attackPower) {
        super(name, strength, health, stamina, speed, attackPower);
    }

    //    farmer specific abilities

    public void plow() {
        System.out.println("I can Plow");
    }

    public void harvest() {
        System.out.println("I can Harvest");
    }



}
