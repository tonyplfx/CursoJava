package EjerciciosSencillos;
import java.util.Scanner;


public class Comparador {

    public static void main(String[] args) {
        int numero1, numero2;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe el primer número");
        numero1 = entrada.nextInt();

        System.out.println("Escribe el segundo número");
        numero2 = entrada.nextInt();

        if (numero1 > numero2)
            System.out.printf("El numero 1 es mayor que el numero 2: %d > %d%n", numero1, numero2);

        if (numero1 < numero2)
            System.out.printf("El numero 1 es menor que el numero 2: %d < %d%n", numero1, numero2);

        if (numero1 == numero2)
            System.out.printf("El numero 1 es igual que el numero 2: %d = %d%n", numero1, numero2);

    }
}
