package homeTasks.homeTask11Exceptions;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceOfExceptions {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> userInput = new ArrayList<>();

    public void exceptionAnalyzer() throws Exception{
        try {
            System.out.println("Enter text");
            String text = scanner.nextLine();
            userInput.add(text);
            System.out.println(text + " was entered");
            userInput.remove(0);
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

}
