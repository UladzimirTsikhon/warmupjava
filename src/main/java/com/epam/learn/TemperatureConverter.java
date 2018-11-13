package com.epam.learn;

public class TemperatureConverter {
    /**
     * celsius to fahrenheit
     */
    public int toFahrenheit(int celsius) {
//        return celsius >= 0 ? (celsius * 9/5) + 32 : (celsius * 9/5) + 31;
        return (celsius * 9/5) + 32;
    }
}
