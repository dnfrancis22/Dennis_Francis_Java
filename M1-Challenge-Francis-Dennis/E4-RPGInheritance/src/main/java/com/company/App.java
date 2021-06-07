package com.company;

public class App {
    public static void main(String[] args) {

        Character Bob = new Farmer("Bob the Farmer",75,100,75,10,1);
        Character Ryan = new Constable("Ryan the Constable",60,100,60,20,5,"Atlanta");
        Character Rex = new Warrior("Rex the Warrior",75,100,100,50,10,100);

        Bob.greet();
        ((Farmer) Bob).plow();
        ((Farmer) Bob).harvest();
        Bob.run();
        Bob.attack();
        Bob.heal();
        Bob.decreaseHealth();
        Bob.increaseStamina();
        Bob.decreaseStamina();
        System.out.println("----------------");
        Ryan.greet();
        ((Constable) Ryan).specificGreet();
        ((Constable) Ryan).arrest();
        Ryan.run();
        Ryan.attack();
        Ryan.heal();
        Ryan.decreaseHealth();
        Ryan.increaseStamina();
        Ryan.decreaseStamina();
        System.out.println("----------------");
        Rex.greet();
        ((Warrior) Rex).warriorSpecificGreet();
        ((Warrior) Rex).decreaseShieldStrength();
        Rex.run();
        Rex.attack();
        Rex.heal();
        Rex.decreaseHealth();
        Rex.increaseStamina();
        Rex.decreaseStamina();


    }
}
