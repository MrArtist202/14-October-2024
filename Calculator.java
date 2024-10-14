package CODE;
import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        int add = a + b;
        int subtract = a-b;
        int multiply = a*b;
        int division = a/b;

        int modulus = a%b;

        System.out.println("The sum is:- " + add);
        System.out.println("The diff is:- "+ subtract);
        System.out.println("The product is:- "+ multiply);
        System.out.println("The dision is:- "+ division);
        System.out.println("The modulus is:- "+ modulus);

    }
}
