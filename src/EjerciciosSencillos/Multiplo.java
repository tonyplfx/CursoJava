/* Escribe un codigo que le pida al usuario dos numeros enteros y que determine si el primero es multiplo del segundo
e imprima el resultado de esta division */
//Importamos los paquete a ejecutar
package EjerciciosSencillos;
import java.util.Scanner;

public class Multiplo {
    public static void main(String[] args){
        //Se declaran las variables que se van a utilizar
        int divisor = 2;
        float division,numero1, numero2, residuo;


        Scanner entrada = new Scanner(System.in); // Se inicia la utilidad de Scaner para poder leer el teclado

        System.out.print("Introduce el numero numero 1: ");
        numero1 = entrada.nextFloat(); //Se le asigna valor a las variables previamente inicializadas

        System.out.print("Introduce el numero numero 2: ");
        numero2 = entrada.nextFloat();

        // Se viene la parte logica

        residuo = numero1%numero2;

        if (residuo == 0)
            System.out.printf("El numero %.2f es multiplo del numero %.2f%n",numero1, numero2); //Se puede limitar los numeros despues del punto decimal con el formato
        if (residuo != 0)
            System.out.printf("El numero %.2f no es multiplo del numero %.3f%n",numero1, numero2);

        division= numero1/numero2;
        System.out.printf("El resultado de la division es %.2f", division);




    }
}
