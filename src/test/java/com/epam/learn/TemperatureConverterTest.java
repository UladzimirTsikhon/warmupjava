package com.epam.learn;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class TemperatureConverterTest {

    private static final TemperatureConverter converter = new TemperatureConverter();

    @Test
    public void cold() {
        assertEquals(-4, converter.toFahrenheit(-20));
    }
}
