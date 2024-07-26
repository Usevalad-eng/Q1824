package homeTasks.homeTask1;

import java.util.Scanner;

public class SeasonTwo {
    public void monthes(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month");
        String userinput = sc.nextLine().toLowerCase().trim();
        switch (userinput){
            case "desember":
            case "january" :
            case "february":
                System.out.println("winter");
                break;
            case "march":
            case "april" :
            case "may":
                System.out.println("spring");
                break;
            case "june":
            case "july" :
            case "august":
                System.out.println("summer");
                break;
            case "september":
            case "oktober" :
            case "november":
                System.out.println("fall");
                break;
            default:
                System.out.println("error");
        }
    }
}
