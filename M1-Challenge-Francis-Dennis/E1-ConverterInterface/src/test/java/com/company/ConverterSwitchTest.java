package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterSwitchTest {
    ConverterSwitch converterSwitch;

    @Before
    public void setUp() {converterSwitch = new ConverterSwitch();}

    @Test
    public void convertMonth() {
        assertEquals("January", converterSwitch.convertMonth(1));
        assertEquals("December", converterSwitch.convertMonth(12));
        assertEquals("Please enter a number between 1 and 12", converterSwitch.convertMonth(14));
    }

    @Test
    public void convertDay() {
        assertEquals("Sunday", converterSwitch.convertDay(1));
        assertEquals("Please enter a number between 1 and 7", converterSwitch.convertDay(14));
    }
}