package homeTasks.homeTask11Exceptions;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceOfExceptionsWithExit {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> userInput = new ArrayList<>();

    public void exceptionAnalyzerWithExit() throws Exception{
        try {
            System.out.println("Enter text");
            String text = scanner.nextLine();
            userInput.add(text);
            System.out.println(text + " was entered");
            System.out.println("To get oldest element enter 'get'");
            if (text.equalsIgnoreCase("get")){
                System.out.println(userInput.get(0) + " is the oldest element");
            }

        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public void run() throws Exception {
        while (true){
            System.out.println("\n----Menu----");
            System.out.println("1 Analyze text with possibility of exception");
            System.out.println("0 Exit");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> exceptionAnalyzerWithExit();
                case 0 -> {
                    System.out.println("Program is finished");
                    return;
                }
                default -> System.out.println("Not right choice");
            }
        }
    }
}
