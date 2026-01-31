package org.example;

public class TemperatureConverter {

    public static double farenheitToCelsius (double temperatureInFarenheit) {
        double temperatureInCelsius = (temperatureInFarenheit - 32) * (5/9);
        return temperatureInCelsius;
    }

    public static double celsiusToFarenheit (double temperatureInCelsius) {
        double temperatureInFarenheit = (temperatureInCelsius * (9/5)) + 32;
        return temperatureInFarenheit;
    }

    public static boolean isExtremeTemperature (double temperatureInCelsius) {
        double highTemperature = 50;
        double lowTemperature = -40;
        if ((temperatureInCelsius > highTemperature) || (temperatureInCelsius <= lowTemperature)) {
            return true;
        }
        return false;
    }

}
