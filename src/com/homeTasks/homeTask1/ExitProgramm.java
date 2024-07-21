package homeTasks.homeTask1;

import java.util.Scanner;

public class ExitProgramm {
    public static void main(String[] args) {
        String a = "exit";
        //String b = " ";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter one word");
        String k = sc.nextLine();


        if (k.equals(a)) {
            System.out.println("Can exit");

        } else {
            System.out.println("You entered something");
            System.out.println("Enter another word");

            String c = sc.nextLine();
            System.out.println("You entered " + c);
            System.out.println("Can exit");

        }

    }
}
