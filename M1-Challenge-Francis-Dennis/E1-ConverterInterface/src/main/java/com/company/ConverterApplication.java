package com.company;



public class ConverterApplication {
    public static void main(String[] args) {

        ConverterIf converterIf = new ConverterIf();

        System.out.println(converterIf.convertMonth(3));
        System.out.println(converterIf.convertMonth(14));
        System.out.println(converterIf.convertDay(3));
        System.out.println(converterIf.convertDay(9));

        ConverterSwitch converterSwitch = new ConverterSwitch();

        System.out.println(converterSwitch.convertMonth(12));
        System.out.println(converterSwitch.convertMonth(14));
        System.out.println(converterSwitch.convertDay(6));
        System.out.println(converterSwitch.convertDay(9));

    }

}
