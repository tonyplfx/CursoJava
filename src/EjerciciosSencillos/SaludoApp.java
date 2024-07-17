package EjerciciosSencillos;

import java.util.Scanner;

public class SaludoApp {
    public static void main(String[] args) {

        double double1 = 20.00;
        double double2 = 80.00;

        double suma = (double1 + double2) * 100;
        System.out.println("El resultado es el siguiente: "+ suma);
        double reminder = suma % 40.00;
        System.out.println("El residuo es el siguiente: "+ reminder);
        boolean result = (reminder == 0) ? true : false;
        System.out.println("El resultado es el siguiente: "+ result);

        if(result)

    }
}


