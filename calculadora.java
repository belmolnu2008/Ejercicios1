import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número entero: ");
        int num2 = scanner.nextInt();

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);

        if (num2 != 0) {
            int division = num1 / num2;
            int modulo = num1 % num2;
            System.out.println("División (cociente entero): " + division);
            System.out.println("Módulo (resto): " + modulo);
        } else {
            System.out.println("No se puede dividir entre cero.");
        }

        scanner.close();
    }
}
