/*Escriba una aplicación que le solicite al usuario un valor entero para el radio de un circulo y le
devuelva el valor de el diametro, area y circunferencia*/

package EjerciciosSencillos;
import java.util.Scanner;
import java.lang.Math;


public class CalculadoraCirculo {
    public static void main(String[] args) {
        float radio,area,diametro,circunferencia;
        Scanner entrada =  new Scanner(System.in);

        System.out.println("Introduce el valor del radio del circulo");
        radio = entrada.nextFloat();

        System.out.print("El valor de la area es : " + Math.PI * Math.pow(radio,2));
    }
}
