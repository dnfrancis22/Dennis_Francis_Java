# M1 Challenge

This challenge consists of several coding exercises that evaluate your understanding of object-oriented programming in Java.

## Challenge Set Up

1. Code must reside in one directory called `M1-Challenge-Lastname-Firstname`.

2. Solutions must reside in their own IntelliJ project as specified below.

## Exercise 1: Converter Interface

1. Create your solution in an IntelliJ project called `ConverterInterface`.

2. Create two implementations of the below interface.

3. The first implementation must use if/else if/else statements and be called `ConverterIf`.

4. The second implementation must use switch statements and be called `ConverterSwitch`.

5. Create a class called `ConverterApplication` which has your main method.

6. Instantiate and use both the `ConverterIf` and `ConverterSwitch` classes in that main method.

7. Implement the interface of ` ConverterIf and ConverterSwitch` classes by using the code below:

```java
public interface Converter {

    /**
     * This method converts the given number into its corresponding month.
     * @param monthNumber the number you wish to convert to a month
     * @return the name of the corresponding month if the parameter value is between 1 and 12; error message otherwise
     */
    String convertMonth(int monthNumber);

    /**
     * This method converts the given number into its corresponding day of the week.
     * @param dayNumber number you wish to convert to a day of the week
     * @return the name of the corresponding day if the parameter value is between 1 and 7, error message otherwise
     * The first day of the week is Sunday
     */
    String convertDay(int dayNumber);

}
```

## Exercise 2: Calculate Object

### Requirements

- In this exercise, you will create an object that has a set of methods that does addition, subtraction, multiplication, and division for two integer parameters and a separate set of methods that does the same for two double parameters.

- You will then instantiate the object and use it to perform the following calculations below.

- You must print out the calculation being performed and the result of the calculation. For example: 2 + 2 = 4.

### Instructions

Create your solution in an IntelliJ project called `CalculatorObject`.

- 1 + 1
- 23 - 52
- 34 * 2
- 12 / 3
- 12 / 7
- 3.4 + 2.3
- 6.7 * 4.4
- 5.5 - 0.5
- 10.8 / 2.2

## Exercise 3: Ice Cream Design

### Requirements

- In this exercise, you will model the attributes of two different `IceCream` classes.

- The first class will represent ice cream as it might be modeled in the point-of-sale system in an ice cream shop. The second class will represent ice cream as it might be modeled in an ice cream factory.

### Instructions

Create your solution in an IntelliJ project called `IceCreamClassDesign`.

## Exercise 4: RPGInheritance

### Requirements

In this exercise, you will design an inheritance hierarchy for characters in a video game. Your design must include a common base class for the following three character types:

- Farmer

- Constable

- Warrior

### Instructions

Create your solution in an IntelliJ project called (`RPGInheritance`).

- Farmer

    - Properties:
        - name
        - strength (initial value = 75)
        - health (initial value = 100)
        - stamina (initial value = 75)
        - speed (initial value = 10)
        - attackPower (initial value = 1)

    - Abilities:
        - run
        - plow
        - harvest
        - attack
        - heal
        - decreaseHealth
        - increaseStamina
        - decreaseStamina

- Constable

    - Properties
        - name
        - strength (initial value = 60)
        - health (initial value = 100)
        - stamina (initial value = 60)
        - speed (initial value = 20)
        - attackPower (initial value = 5)
        - jurisdiction

    - Abilities:
        - run
        - arrest
        - attack
        - heal
        - decreaseHealth
        - increaseStamina
        - decreaseStamina

- Warrior

    - Properties
        - name
        - strength (initial value = 75)
        - health (initial value = 100)
        - stamina (initial value = 100)
        - speed (initial value = 50)
        - attackPower (initial value = 10)
        - shieldStrength (initial value = 100)

    - Abilities:
        - run
        - attack
        - heal
        - decreaseHealth
        - increaseStamina
        - decreaseStamina
        - decreaseShieldStrength

## Exercise 5: Customer Composition

### Requirements

- In this exercise, you will design and implement a class that represents a customer based on the specifications below.

- Use composition for maximum code reuse.

### Instructions

Create your solution in an IntelliJ project called `CustomerComposition`.

- Design a Customer class that keeps track of:

    - First name

    - Last name

    - Email

    - Phone number

    - Shipping address:
        - Street 1
        - Street 2
        - City
        - State
        - Zip

    - Billing address:
        - Street 1
        - Street 2
        - City
        - State
        - Zip

    - If the customer is a Rewards Member or not.