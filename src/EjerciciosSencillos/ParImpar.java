//Escribe un programa que pida al usuario dos numeros enteros y como salida te diga si es impar o par

package EjerciciosSencillos;
import java.util.Scanner;


public class ParImpar {
    public static void main(String[] args){
        int number1;
        int residuo;
        int divisor = 2;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Danos el numero a evaluar: ");
        number1 = entrada.nextInt();

        residuo = number1%divisor;

        if(residuo==0){
            System.out.print("El numero es par");
        }
        if(residuo != 0)
            System.out.print("El numero es impar");
    }
}
