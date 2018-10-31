package com.epam.learn;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TemperatureConverterTest {

    private static final TemperatureConverter converter = new TemperatureConverter();

    @Test
    public void cold() {
        assertEquals(-4, converter.toFahrenheit(-20));
    }

    @Test
    public void cool() {
        assertEquals(32, converter.toFahrenheit(0));
    }

    @Test
    public void medium() {
        assertEquals(59, converter.toFahrenheit(15));
    }

    @Test
    public void hot() {
        assertEquals(104, converter.toFahrenheit(40));
    }
}
