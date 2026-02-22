package org.example;

public class TemperatureConverter {

    public static double farenheitToCelsius (double temperatureInFarenheit) {
        double temperatureInCelsius = (temperatureInFarenheit - 32) * (5.0/9.0);
        return temperatureInCelsius;
    }

    public static double celsiusToFarenheit (double temperatureInCelsius) {
        double temperatureInFarenheit = (temperatureInCelsius * (9.0/5.0)) + 32;
        return temperatureInFarenheit;
    }

    public static double kelvinToCelsius(double temperatureInKelvin) {
        double temperatureKtoCelsius = temperatureInKelvin - 273.15;
        return temperatureKtoCelsius;
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
