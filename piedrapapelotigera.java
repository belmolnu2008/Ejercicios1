import java.util.Random;
import java.util.Scanner;

public class piedrapapelotigera {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int jugador;
        int maquina;

        System.out.println("Juego de PIEDRA, PAPEL O TIJERA");

        while (true) {
            System.out.print("\n1 = Piedra, 2 = Papel, 3 = Tijera (0 = Salir): ");

            if (!sc.hasNextInt()) {
                System.out.println("Introduce un número del 0 al 3.");
                sc.next();
                continue;
            }

            jugador = sc.nextInt();
            if (jugador == 0) {
                break;
            }
            if (jugador < 1 || jugador > 3) {
                System.out.println("Opción no válida. Elige 1, 2 o 3.");
                continue;
            }

            maquina = rnd.nextInt(3) + 1;
            System.out.println("Tú: " + nombre(jugador));
            System.out.println("Máquina: " + nombre(maquina));

            if (jugador == maquina) {
                System.out.println("¡Empate!");
            } else if ((jugador == 1 && maquina == 3)
                    || (jugador == 2 && maquina == 1)
                    || (jugador == 3 && maquina == 2)) {
                System.out.println("¡Has ganado!");
            } else {
                System.out.println("Ha ganado la máquina.");
            }
        }

        System.out.println("¡Gracias por jugar!");
        sc.close();
    }

    public static String nombre(int opcion) {
        if (opcion == 1) {
            return "Piedra";
        } else if (opcion == 2) {
            return "Papel";
        } else {
            return "Tijera";
        }
    }
}
