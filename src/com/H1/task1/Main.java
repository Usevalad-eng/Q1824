package com.H1.task1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String a = "A";
        String b = "B";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter letter");
        String k = sc.nextLine();
        //String k = "A";

        if (k.equals(a)) {
            System.out.println("This is glasnaya");

        }
        else if (k.equals(b)) {

            System.out.println("This is soglasnaya");
        }
        else {
            System.out.println("Don't know");
        }
    }
}
