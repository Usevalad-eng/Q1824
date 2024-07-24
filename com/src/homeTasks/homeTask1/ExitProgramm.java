package homeTasks.homeTask1;

import java.util.Scanner;

public class ExitProgramm {
    public  void input() {
        /*
        String a = "exit";

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
*/
        Scanner sc = new Scanner(System.in);
        String input;
        System.out.println("Enter a word, if Exit, you will exit");
        while (true){
            input=sc.nextLine().trim();
            if (input.equalsIgnoreCase("exit")){
                System.out.println("exit");
                break;

            } else {
                System.out.println("you entered:   " + input);
                System.out.println("Enter a word, if Exit, you will exit");
            }
        }

    }
}
