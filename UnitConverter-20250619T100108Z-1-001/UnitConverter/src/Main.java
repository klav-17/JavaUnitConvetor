import java.util.Scanner;
// Abstract Base Class
abstract class Conversion {
    abstract void convert(Scanner scanner);
}

// Length Conversion Class
class Length extends Conversion {
    @Override
    void convert(Scanner scanner) {
        System.out.println("Length Conversion:");
        System.out.println("1. Meters to Feet");
        System.out.println("2. Kilometers to Miles");
        System.out.print("Enter your choice (1 or 2): ");
        int option = scanner.nextInt();

        System.out.print("Enter the value to convert: ");
        double value = scanner.nextDouble();

        switch (option) {
            case 1:
                System.out.println(value + " meters is " + metersToFeet(value) + " feet.");
                break;
            case 2:
                System.out.println(value + " kilometers is " + kilometersToMiles(value) + " miles.");
                break;
            default:
                System.out.println("Invalid option.");
        }
    }

    double metersToFeet(double meters) {
        return meters * 3.28084;
    }

    double kilometersToMiles(double kilometers) {
        return kilometers * 0.621371;
    }
}

// Temperature Conversion Class
class Temperature extends Conversion {
    @Override
    void convert(Scanner scanner) {
        System.out.println("Temperature Conversion:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter your choice (1 or 2): ");
        int option = scanner.nextInt();

        System.out.print("Enter the temperature to convert: ");
        double value = scanner.nextDouble();

        switch (option) {
            case 1:
                System.out.println(value + "°C is " + celsiusToFahrenheit(value) + "°F.");
                break;
            case 2:
                System.out.println(value + "°F is " + fahrenheitToCelsius(value) + "°C.");
                break;
            default:
                System.out.println("Invalid option.");
        }
    }

    double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}

// Mass Conversion Class
class Mass extends Conversion {
    @Override
    void convert(Scanner scanner) {
        System.out.println("Mass Conversion:");
        System.out.println("1. Kilograms to Pounds");
        System.out.println("2. Grams to Ounces");
        System.out.print("Enter your choice (1 or 2): ");
        int option = scanner.nextInt();

        System.out.print("Enter the value to convert: ");
        double value = scanner.nextDouble();

        switch (option) {
            case 1:
                System.out.println(value + " kg is " + kilogramsToPounds(value) + " pounds.");
                break;
            case 2:
                System.out.println(value + " grams is " + gramsToOunces(value) + " ounces.");
                break;
            default:
                System.out.println("Invalid option.");
        }
    }

    double kilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    double gramsToOunces(double grams) {
        return grams * 0.03527396;
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Unit Converter!");
        System.out.println("Choose the type of conversion:");
        System.out.println("1. Length");
        System.out.println("2. Temperature");
        System.out.println("3. Mass");
        System.out.print("Enter your choice (1, 2, or 3): ");
        int choice = scanner.nextInt();

        Conversion conversion = null;

        switch (choice) {
            case 1:
                conversion = new Length();
                break;
            case 2:
                conversion = new Temperature();
                break;
            case 3:
                conversion = new Mass();
                break;
            default:
                System.out.println("Invalid choice! Exiting.");
                System.exit(0);
        }

        conversion.convert(scanner);
        scanner.close();
    }
}

