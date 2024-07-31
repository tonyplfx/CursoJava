package JavaMasterClass;
import java.util.Scanner;

public class BarkingDog {
    public static void main(String[] args) {
        //Initializing variables
        boolean barking,shouldIWakeUp;
        int hourOfDay;
        char yesOrNo;
        Scanner sc = new Scanner(System.in);

        //Retrieving Data, but in this part, we add a logical part to convert the yes or no in a true or false
        System.out.println("The dog is barking ?");
        yesOrNo = sc.next().charAt(0);
        barking = yesOrNo == 'y';
        /* The line code written just above, Does the same thing that the block of code written below
        if (yesOrNo == 'y') {
            barking = true;
        } else {
            barking = false;
        }
        */
        System.out.println("What hour in the day is ?");
        hourOfDay = sc.nextInt();

        //Calling the function
        shouldIWakeUp = shouldWakeUp(barking, hourOfDay);
        if (shouldIWakeUp){
            System.out.println("You need to wakeup");
        } else {
            System.out.println("You don't need to wake up");
        }


    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking && (8 > hourOfDay || hourOfDay > 22)){
            return true;
        }
        else if (0 > hourOfDay || hourOfDay > 23 ){
            return false;
        }
         else
        return false;
    }
}