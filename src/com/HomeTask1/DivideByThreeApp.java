package HomeTask1;
import java.util.Scanner;

public class DivideByThreeApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();

        if ((num1 % num2 == 0) || num1 <= num2) {

            int i = 0;

            int sum;
            for (sum = num1; sum <= num2; i++) {
                sum += i;

            }

            System.out.println(sum);
        } else {
            System.out.println("Error, can't devide");
        }

    }
}
