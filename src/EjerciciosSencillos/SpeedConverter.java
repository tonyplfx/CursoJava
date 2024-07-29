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

        //Calling to the functions
        long km = toMilesPerHour(kilometersPerHour);
        printConversion(km);
    }

    public static long toMilesPerHour (double kilometersPerHour){
        if (kilometersPerHour <= 0)
            return -1;
        else {
            long mi = (long) (kilometersPerHour * 1.609);
        return (long) mi;
        }
    }

    public static void printConversion(long km){
        if (km < 0) {
            System.out.println("Invalid Numbver");
            return;
        }else {
            System.out.println(km + "km/h =mi/h");
        }
    }
}
