package JavaMasterClass;
import java.util.Scanner;

public class CentimetersConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give us your height in ft and inch");
        double v = convertToCentimeters(sc.nextInt(), sc.nextInt());
        System.out.println ("The total number in Cm is : " + convertToCentimeters(v));
    }
    public static double convertToCentimeters(double inches){
       return inches *= 2.54;
    }
    public static double convertToCentimeters(int heightFt, int remFt){
        int resFt = heightFt * 12;
        return resFt + remFt;
    }
}
