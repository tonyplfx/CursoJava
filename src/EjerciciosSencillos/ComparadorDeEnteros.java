package EjerciciosSencillos;
//Compara enteros utilizando Instrucciones if, operadores relacionales y de igualdades.

import java.awt.*;
import java.util.Scanner;

public class  ComparadorDeEnteros {
    //El metodo main empieza la ejecución de la aplicacion de java
    public static void main(String[] args) {
        //Se crea el objeto Scanner para obtener la entrada
        Scanner entrada = new Scanner(System.in);

        int numero1;//Primer número a comparar
        int numero2;//Segundo numero a comparar

        System.out.print("Escriba el primer entero: "); //Indicador
        numero1 = entrada.nextInt(); //Lee el primer numero del usuario

        System.out.print("Escriba el segundo entero: ");//Indicador
        numero2 = entrada.nextInt();//Lee el segundo numero entero

        if (numero1 == numero2)
            System.out.printf("%d == %d%n" ,numero1, numero2);

        if (numero1 != numero2)
            System.out.printf("%d != %d%n", numero1, numero2);

        if (numero1 < numero2)
            System.out.printf("%d < %d%n", numero1, numero2);

        if (numero1 > numero2)
            System.out.printf("%d > %d%n", numero1, numero2);

        if (numero1 <= numero2)
            System.out.printf("%d <= %d%n", numero1, numero2);

        if(numero1 >= numero2)
            System.out.printf("%d >= %d%n", numero1, numero2);

    }

}
