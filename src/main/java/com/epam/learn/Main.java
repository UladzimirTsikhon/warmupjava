package com.epam.learn;

public class Main {
    private static final String usage = "pass celsius as command line argument";

    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();
        if (args.length != 1) {
            System.out.println(usage);
        } else {
            System.out.println(converter.toFahrenheit(Integer.valueOf(args[0])));
        }
    }
}
