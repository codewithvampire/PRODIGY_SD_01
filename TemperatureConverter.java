import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature value: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter original unit (Celsius, Fahrenheit, or Kelvin): ");
        String originalUnit = scanner.next().toLowerCase();

        double convertedToFahrenheit = convertToCelsiusToFahrenheit(temperature, originalUnit);
        double convertedToKelvin = convertToCelsiusToKelvin(temperature, originalUnit);

        System.out.println("Converted to Fahrenheit: " + convertedToFahrenheit + " °F");
        System.out.println("Converted to Kelvin: " + convertedToKelvin + " K");

        scanner.close();
    }

    private static double convertToCelsiusToFahrenheit(double temperature, String fromUnit) {
        switch (fromUnit) {
            case "celsius":
                return (temperature * 9 / 5) + 32;
            case "kelvin":
                return (temperature - 273.15) * 9 / 5 + 32;
            default:
                return temperature;
        }
    }

    private static double convertToCelsiusToKelvin(double temperature, String fromUnit) {
        switch (fromUnit) {
            case "fahrenheit":
                return (temperature - 32) * 5 / 9 + 273.15;
            case "celsius":
                return temperature + 273.15;
            default:
                return temperature;
        }
    }
}
