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
            if (text.equalsIgnoreCase("") || text.matches("\\s+")){
            throw new ServiceExceptionOfMemory ("Zero memory exception");
            }
            if (text.length()>=20){
                throw new ServiceExceptionOfStackOverFlowMemory("Length of text must be less than 20");
            }
            userInput.add(text);
            System.out.println("\"" + text + "\"" + " was entered");
            userInput.remove(0);
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
