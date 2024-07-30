package EjerciciosSencillos;
import java.util.Scanner;
import java.lang.Math;


public class SpeedConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double kilometersPerHour;

        //Data Entry
        System.out.println("Give me the kilometers Per Hour to convert");
        kilometersPerHour = sc.nextDouble();
        System.out.println("The km are = "+ kilometersPerHour);
        //Calling to the functions
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        System.out.println("The miles per hour = "+ milesPerHour);
    }

    public static long toMilesPerHour (double kilometersPerHour){
        long mi;
        if (kilometersPerHour <= 0)
            return -1;
        else {
             return Math.round((long) (kilometersPerHour * 0.6213));
        }

    }
/*
    public static void printConversion(long mi,long kilometersPerHour){
        if (mi < 0) {
            System.out.println("Invalid Number");
            return;
        }else {
            System.out.println(mi + "mi/h =" + kilometersPerHour +"km/h");
        }
    }
 */
}
