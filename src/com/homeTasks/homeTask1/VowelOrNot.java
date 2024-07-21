package homeTasks.homeTask1;

import java.util.Scanner;

public class VowelOrNot {
    public static void main(String[] args) {
        String a = "A";
        String b = "E";
        String c = "O";
        String d = "U";
        String e = "Y";
        String f = "I";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter letter");
        String k = sc.nextLine();


        if (k.equals(a) || k.equals(b) || k.equals(c) || k.equals(d) || k.equals(e) || k.equals(f)) {
            System.out.println("This is vowel");

        } else {

            System.out.println("This is consonant");
        }

    }
}
