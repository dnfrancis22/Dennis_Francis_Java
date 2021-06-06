package com.company;

import com.company.interfaces.Converter;

public class ConverterIf implements Converter {
    @Override
    public String convertMonth(int monthNumber) {
        String month = "";
        if (monthNumber < 1 || monthNumber >12) {
            month = "Please enter a number between 1 and 12";
        } else if (monthNumber == 1) {
            month = "January";
        }
        return month;
    }

    @Override
    public String convertDay(int dayNumber) {
        String day = "";
        if (dayNumber < 1 || dayNumber > 7) {
            day = "Please enter a number between 1 and 7";
        } else if (dayNumber == 1) {
            day = "Sunday";
        }
        return day;
    }
}
