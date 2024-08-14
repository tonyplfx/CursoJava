package JavaMasterClass;
import java.util.Scanner;

public class MegaBytesConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Give us the Size in Kb to convert in Mb");
        int kiloBytes = sc.nextInt();
        printMegaBytesAndKilobytes(kiloBytes);

    }
    public static void printMegaBytesAndKilobytes(int kiloBytes){
        if (kiloBytes < 0){
            System.out.println("Invalid Number");
        } else{
            int megaBytes = kiloBytes/1024;
            int remainder = kiloBytes % 1024;
            System.out.println(kiloBytes +"Kb = " +megaBytes + " MB AND "+ remainder +"Kb" );
        }
        return;
    }
}


