package homeTasks.homeTaskeEightStrings;

import classTasks.lessonEightTodoList.Task;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class AnalizerOfText {
    private Scanner scanner = new Scanner(System.in);
    public void analizerOfText(){
        System.out.println("Enter text"); //quantity of words
        String text = scanner.nextLine();
        int countText = text.split("\\s").length;
        System.out.println("Quantity of words: " + countText);
        System.out.println("------------------------");
        String longest = Arrays.stream(text.split(" ")) //longest word
                .max(Comparator.comparingInt(String::length))
                .orElse(null);
        System.out.println("Longest word: " + longest);
        System.out.println("------------------------");
        String str = text; //frequencies of characters
        int[] freq = new int[str.length()];
        int i, j;
        char[] string = str.toCharArray();

        for(i = 0; i <str.length(); i++) {
            freq[i] = 1;
            for(j = i+1; j <str.length(); j++) {
                if(string[i] == string[j]) {
                    freq[i]++;
                    string[j] = '0';
                }
            }
        }
        System.out.println("Characters and their corresponding frequencies");
        for(i = 0; i <freq.length; i++) {
            if(string[i] != ' ' && string[i] != '0')
                System.out.println(string[i] + "-" + freq[i]);
        }
        System.out.println("------------------------");
        String originalStr = text; //reverse of words
        String reversedStr = "";
        for (int y = 0; y < originalStr.length(); y++) {
            reversedStr = originalStr.charAt(y) + reversedStr;
        }
        System.out.println("Reversed string: "+ "\n" + reversedStr.replaceAll("\\s", "\n"));
        System.out.println("------------------------");
        String origString = text; //if a palindrome
        String reverseString = new StringBuilder(origString).reverse().toString();
        if (origString.replaceAll("\\s", "")
                .equals(reverseString.replaceAll("\\s", ""))) {
            System.out.println("String is a palindrome.");
        } else {
            System.out.println("String is not a palindrome.");
        }
    }
}
