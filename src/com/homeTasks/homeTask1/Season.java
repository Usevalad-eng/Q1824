package homeTasks.homeTask1;

import java.util.Scanner;

public class Season {
    public  void season() {
        String m1 = "December";
        String m2 = "January";
        String m3 = "February";

        String m4 = "March";
        String m5 = "April";
        String m6 = "May";
        String m7 = "June";
        String m8 = "July";
        String m9 = "August";
        String m10 = "June";
        String m11 = "July";
        String m12 = "August";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month");
        String month = sc.nextLine();


        if (month.equals(m1) || month.equals(m2) || month.equals(m3)) {
            System.out.println("This is Winter");

        } else if (month.equals(m4) || month.equals(m5) || month.equals(m6)) {

            System.out.println("This is Spring");
        } else if (month.equals(m7) || month.equals(m8) || month.equals(m9)) {

            System.out.println("This is Spring");
        } else if (month.equals(m10) || month.equals(m11) || month.equals(m12)) {

            System.out.println("This is Fall");
        } else {
            System.out.println("Error, check words you have entered");
        }
    }
}
