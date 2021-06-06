package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterIfTest {
    ConverterIf converterIf;

    @Before
    public void setUp() {
        converterIf = new ConverterIf();
    }

    @Test
    public void convertMonth() {
        assertEquals("January", converterIf.convertMonth(1));
        assertEquals("Please enter a number between 1 and 12", converterIf.convertMonth(14));
    }

    @Test
    public void convertDay() {
        assertEquals("Sunday", converterIf.convertDay(1));
    }
}