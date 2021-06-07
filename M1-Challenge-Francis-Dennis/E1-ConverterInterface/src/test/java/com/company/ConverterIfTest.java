package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterIfTest {
    ConverterIf converterIf;

    @Before
//    sets up the converterIf before each test
    public void setUp() {
        converterIf = new ConverterIf();
    }

    @Test
//    Tests the convertMonth method from ConverterIf
    public void convertMonth() {
        assertEquals("January", converterIf.convertMonth(1));
        assertEquals("December", converterIf.convertMonth(12));
        assertEquals("Please enter a number between 1 and 12", converterIf.convertMonth(14));
    }

    @Test
    //    Tests the convertDay method from ConverterIf
    public void convertDay() {
        assertEquals("Sunday", converterIf.convertDay(1));
        assertEquals("Please enter a number between 1 and 7", converterIf.convertDay(14));
    }
}