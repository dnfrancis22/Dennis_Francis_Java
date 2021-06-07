package com.company;


public class ConverterApplication {

//    Main method that the app runs through
    public static void main(String[] args) {

        //Instantiates ConverterIf
        ConverterIf converterIf = new ConverterIf();

        //Prints the results to the console
        System.out.println(converterIf.convertMonth(3));
        System.out.println(converterIf.convertMonth(14));
        System.out.println(converterIf.convertDay(3));
        System.out.println(converterIf.convertDay(9));

        //Instantiates ConverterIf
        ConverterSwitch converterSwitch = new ConverterSwitch();

        //Prints the results to the console
        System.out.println(converterSwitch.convertMonth(12));
        System.out.println(converterSwitch.convertMonth(14));
        System.out.println(converterSwitch.convertDay(6));
        System.out.println(converterSwitch.convertDay(9));

    }

}
