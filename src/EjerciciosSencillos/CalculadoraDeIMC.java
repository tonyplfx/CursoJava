package EjerciciosSencillos;
import java.util.Scanner;

public class CalculadoraDeIMC {
    public static void main(String[] args) {
        float peso, altura, imc;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Buenas tardes, introduzca su peso en Kg: ");
        peso = entrada.nextFloat();

        System.out.print("Ahora introduce tu estatura en metros: ");
        altura = entrada.nextFloat();

        imc = peso/(altura*altura);
        System.out.printf("Tu Indice de Masa Corporal es: %.2f", imc);

    }
}
