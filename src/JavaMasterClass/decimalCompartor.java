package JavaMasterClass;

public class decimalCompartor {
    public static void main(String[] args) {
        areEqualByThreedecimalPlaces(1.233,1.234495);
    }
    public static boolean areEqualByThreedecimalPlaces(double num1,double num2){
        num1 = num1 * 1000;
        num2 = num2 * 1000;
        int num12 = (int) num1;
        int num22 = (int) num2;

        if(num12 == num22){
            System.out.println("Equal");
            return true;
        } else {
            System.out.println("Not Equal");
            return false;
        }
    }
}
