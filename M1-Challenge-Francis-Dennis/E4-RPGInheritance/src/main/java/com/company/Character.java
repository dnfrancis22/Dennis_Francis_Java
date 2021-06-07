package com.company;

import java.util.Objects;

public class Character {

    //  Instance Variables
    private String name;
    private int strength;
    private int health;
    private int stamina;
    private int speed;
    private int attackPower;

    //  Generated constructor with instance variables as parameters
    public Character(String name, int strength, int health, int stamina, int speed, int attackPower) {
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.speed = speed;
        this.attackPower = attackPower;
    }

    //  getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    //  Abilities
    public void run() {
        System.out.println("I am running");
    }

    public void attack() {
        System.out.println("I am attacking");
    }

    public void heal() {
        System.out.println("I am healing");
    }

    public void decreaseHealth() {
        System.out.println("My Health is decreasing");
    }

    public void increaseStamina() {
        System.out.println("My Stamina is increasing");
    }

    public void decreaseStamina() {
        System.out.println("My Stamina is decreasing");
    }

    @Override
    //  Generated equals
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return strength == character.strength && health == character.health && stamina == character.stamina && speed == character.speed && attackPower == character.attackPower && Objects.equals(name, character.name);
    }

    @Override
    //  Generated hashcode
    public int hashCode() {
        return Objects.hash(name, strength, health, stamina, speed, attackPower);
    }

    @Override
    //  Generated toString
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", health=" + health +
                ", stamina=" + stamina +
                ", speed=" + speed +
                ", attackPower=" + attackPower +
                '}';
    }
//    - Farmer
//
//  - Properties:

//  - Abilities:
//    - run
//         - plow
//         - harvest
//    - attack
//    - heal
//    - decreaseHealth
//    - increaseStamina
//    - decreaseStamina
//
//- Constable
//
//  - Properties
//    - jurisdiction
//
//  - Abilities:
//    - run
//         - arrest
//    - attack
//    - heal
//    - decreaseHealth
//    - increaseStamina
//    - decreaseStamina
//
//- Warrior
//
//  - Properties
//    - shieldStrength (initial value = 100)
//
//  - Abilities:
//    - run
//    - attack
//    - heal
//    - decreaseHealth
//    - increaseStamina
//    - decreaseStamina
//         - decreaseShieldStrength

}
