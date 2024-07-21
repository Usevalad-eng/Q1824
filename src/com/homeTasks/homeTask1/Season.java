package homeTasks.homeTask1;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        String m1 = "December";
        String m2 = "January";
        String m3 = "February";

        String m4 = "March";
        String m5 = "April";
        String m6 = "May";
        String m7 = "June";
        String m8 = "July";
        String m9 = "August";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month");
        String month = sc.nextLine();


        if (month.equals(m1) || month.equals(m2) || month.equals(m3)) {
            System.out.println("This is Winter");

        } else if (month.equals(m4) || month.equals(m5) || month.equals(m6)) {

            System.out.println("This is Spring");
        } else if (month.equals(m7) || month.equals(m8) || month.equals(m9)) {

            System.out.println("This is Spring");
        } else {
            System.out.println("Don't Summer or Fall");
        }
    }
}
