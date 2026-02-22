package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature in celsius: ");

        double temperatureInCelsius = Double.parseDouble(scanner.nextLine());
        double convertedToFahrenheit = TemperatureConverter.celsiusToFarenheit(temperatureInCelsius);

        System.out.printf("%.2f Celsius is %.2f Fahrenheit", temperatureInCelsius, convertedToFahrenheit);
    }
}
