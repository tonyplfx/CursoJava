package JavaMasterClass;

//In this class the method makes 3 comparations
public class LeapYear {
    //In this section we give the value of the method.
    public static void main(String[] args) {
        isLeapYear(2000);
    }
    public static void isLeapYear (int year){
        if (year >= 1 && year <= 9999){
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                System.out.println("Leap Year");
            } else {
                System.out.println("Not a Leap Year");
            }
        } else {
            System.out.println("Invalid Number");
        }
    }
}
