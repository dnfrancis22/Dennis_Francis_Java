package com.company;

import com.company.interfaces.Converter;

public class ConverterSwitch implements Converter {
    @Override
    public String convertMonth(int monthNumber) {
        return switch (monthNumber) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Please enter a number between 1 and 12";
        };
    }

    @Override
    public String convertDay(int dayNumber) {
        return switch (dayNumber) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "Please enter a number between 1 and 7";
        };
    }
}
