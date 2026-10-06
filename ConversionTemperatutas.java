import java.util.Scanner;

public class ConversionTemperatutas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;
        double kelvin = celsius + 273.15;

        System.out.printf("La temperatura en Fahrenheit es: %.2f°F%n", fahrenheit);
        System.out.printf("La temperatura en Kelvin es: %.2fK%n", kelvin);

        scanner.close();
    }
}
    


