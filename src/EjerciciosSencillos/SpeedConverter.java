package EjerciciosSencillos;
import java.util.Scanner;
import java.lang.Math;


public class SpeedConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double kilometersPerHour;

        //Data Entry
        System.out.print("Give me the kilometers Per Hour to convert = ");
        //Calling to the functions
        long milesPerHour = toMilesPerHour(kilometersPerHour = sc.nextDouble());
        printConversion(milesPerHour,kilometersPerHour);

    }

    public static long toMilesPerHour (double kilometersPerHour){
        long mi;
        if (kilometersPerHour <= 0)
            return -1;
        else {
             return Math.round((long) (kilometersPerHour * 0.6213));
        }

    }

    public static void printConversion(long milesPerHour,double kilometersPerHour){
        if (milesPerHour < 0) {
            System.out.println("Invalid Number");
            return;
        }else {
            System.out.println("The km/h are = "+ kilometersPerHour);
            System.out.println("The mi/h are = "+ milesPerHour);
        }
    }

}
