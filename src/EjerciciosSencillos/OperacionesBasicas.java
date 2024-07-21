package EjerciciosSencillos;

import java.util.Scanner;

public class OperacionesBasicas {

    public static void main (String[] ags){

        Scanner entrada = new Scanner(System.in);

        int number1;
        int number2;
        int suma;
        int resta;
        int mult;
        int div;
        int modulo;

        System.out.print("Introduce el primer número: ");
        number1 = entrada.nextInt();

        System.out.print("Introduce el segundo numero: ");
        number2 = entrada.nextInt();

        suma = number1 + number2;
        resta = number1 - number2;
        mult = number1 * number2;
        div = number1/number2;
        modulo = number1 % number2;

        System.out.println("Buenas tardes damas y caballeros, el resultado de nuestras operaciones es el siguiente: ");
        System.out.println("El resultado de la suma es el siguiente: " + suma);
        System.out.println("El resultado de la resta es el siguiente: " + resta);
        System.out.println("El resultado de la multiplicacion es el siguiente: " + mult);
        System.out.println("El resultado de la división es el siguiente: " + div);
        System.out.println("El resultado del modulo es el siguiente: " +modulo);


    }
}