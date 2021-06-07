package com.company;

import com.company.Calculator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calc;

    @Before
    //    sets up the calculator before each test
    public void setUp() {
        calc = new Calculator();
    }

    @Test
    //    Tests the add int method from the com.company.Calculator Object
    public void shouldAddTwoIntegers() {
        assertEquals(3, calc.add(1, 2));
    }

    @Test
    //    Tests the add doubles method from the com.company.Calculator Object
    public void shouldAddTwoDoubles() {
        assertEquals(5.3, calc.add(2.2d, 3.1d), .0001);
    }
    @Test
    //    Tests the subtract int method from the com.company.Calculator Object
    public void shouldSubtractTwoIntegers() {
        assertEquals(3, calc.subtract(5, 2));
    }

    @Test
    //    Tests the subtract doubles method from the com.company.Calculator Object
    public void shouldAddSubtractDoubles() {
        assertEquals(2.1, calc.subtract(5.2d, 3.1d), .0001);
    }
    @Test
    //    Tests the multiply int method from the com.company.Calculator Object
    public void shouldMultiplyTwoIntegers() {
        assertEquals(2, calc.multiply(1, 2));
    }

    @Test
    //    Tests the multiply doubles method from the com.company.Calculator Object
    public void shouldMultiplyTwoDoubles() {
        assertEquals(6.82, calc.multiply(2.2d, 3.1d), .0001);
    }
    @Test
    //    Tests the divide int method from the com.company.Calculator Object
    public void shouldDivideTwoIntegers() {
        assertEquals(2, calc.divide(4, 2));
    }

    @Test
    //    Tests the divide doubles method from the com.company.Calculator Object
    public void shouldDivideTwoDoubles() {
        assertEquals(1.6, calc.divide(4d, 2.5d), .0001);
    }
}
