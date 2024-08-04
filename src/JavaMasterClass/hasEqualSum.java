package JavaMasterClass;
import java.util.Scanner;

public class hasEqualSum {
    public static void main(String[] args) {
        boolean equals;
        int prim, seg, ter;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number to the sum");
        prim = sc.nextInt();
        System.out.println("Enter the second number to the sum");
        seg = sc.nextInt();
        System.out.println("Enter the third number to the sum");
        ter = sc.nextInt();

        equals = equalSum(prim, seg, ter);
        if (equals)
            System.out.println("the Sum of the two numbers are equal to the third number");
        else {
            System.out.println("the Sum of the two numbers are not equal to the third number");
        }
    }
    public static boolean equalSum(int firstNum, int SecondNum, int ThirdNum) {
        return (firstNum + SecondNum == ThirdNum);
    }
}

/*
Another way to write the same result that the block code above is the following
This is the way that we can improve our code, we can
    public static boolean equalSum(int firstNum, int SecondNum, int ThirdNum) {
        if (firstNum + SecondNum == ThirdNum){
            return true;
        } else{
            return false;
        }
    }

 */