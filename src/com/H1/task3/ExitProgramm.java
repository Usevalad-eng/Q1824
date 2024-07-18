package com.H1.task3;
import java.util.Scanner;

public class ExitProgramm {
    public static void main(String[] args) {
        String a = "exit";
        String b = " ";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter one word");
        String k = sc.nextLine();




        if (k.equals(a)) {
            System.out.println("Can exit");

        }
        else if (k.equals(b)) {
            System.out.println("You entered nothing");
            System.out.println("Enter something");

            String c = sc.nextLine();
            System.out.println("You entered "+c);
            System.out.println("Can exit");
        }
        else {
            System.out.println("Don't know, may be you can exit");
        }
    }
}
