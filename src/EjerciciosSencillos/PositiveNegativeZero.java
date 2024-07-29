//Ejerciciop que evalua si un numero es positivo negativo o zero.

package EjerciciosSencillos;
import java.util.Scanner;
public class PositiveNegativeZero {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el numero: ");
        number = sc.nextInt();
        checkNumber(number);
    }

    public static void checkNumber (int number){
    if (number >0)
            System.out.println("positive");
    else if (number < 0)
            System.out.println("negative");
    else
            System.out.println("0");
    return;
}
}
