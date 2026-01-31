package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature in celsius: ");

        double temperatureInCelsius = Double.parseDouble(scanner.nextLine());

        double convertedToFarenheit = TemperatureConverter.celsiusToFarenheit(temperatureInCelsius);

        System.out.printf("%.2f Celsius is %.2f Farenheit", temperatureInCelsius, convertedToFarenheit);
    }
}
