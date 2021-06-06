package com.company;

import com.company.interfaces.Converter;

public class ConverterIf implements Converter {
    @Override
    public String convertMonth(int monthNumber) {
        String month = "";
        if (monthNumber == 1) {
            month = "January";
        }
        return month;
    }

    @Override
    public String convertDay(int dayNumber) {
        String day = "";
        if (dayNumber == 1) {
            day = "Sunday";
        }
        return day;
    }
}
