package com.H1.task4;
import java.util.Scanner;

public class DivideByThreeApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        int sum=num1;
        if ((num1 % num2 == 0) || num1<=num2) {
            for (int i=0; i < num2; i++) {
            sum+=i;

            }
            System.out.println(sum);
        }
        else{
                System.out.println("Error, can't devide");
        }

    }
}
