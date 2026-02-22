package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TemperatureConverterTest {
    @Test
    void testFahrenheitToCelsius() {
        // (32°F − 32) × 5/9 = 0°C
        assertEquals(0.0, TemperatureConverter.farenheitToCelsius(32));
        // (212°F − 32) × 5/9 = 100°C
        assertEquals(100.0, TemperatureConverter.farenheitToCelsius(212));
    }

    @Test
    void testCelsiusToFahrenheit() {
        // (0°C × 9/5) + 32 = 32°F
        assertEquals(32.0, TemperatureConverter.celsiusToFarenheit(0));
        // (100°C × 9/5) + 32 = 212°F
        assertEquals(212.0, TemperatureConverter.celsiusToFarenheit(100));
    }

    @Test
    void testKelvinToCelsius() {
        // Example: 300K - 273.15 = 26.85°C
        assertEquals(26.85, TemperatureConverter.kelvinToCelsius(300), 0.001);
        // Absolute zero
        assertEquals(-273.15, TemperatureConverter.kelvinToCelsius(0), 0.001);
    }

    @Test
    void testIsExtremeTemperature() {
        // Test high extreme
        assertTrue(TemperatureConverter.isExtremeTemperature(50.1));
        // Test low extreme
        assertTrue(TemperatureConverter.isExtremeTemperature(-40.0));
        // Test normal temperature
        assertFalse(TemperatureConverter.isExtremeTemperature(25.0));
    }

}
