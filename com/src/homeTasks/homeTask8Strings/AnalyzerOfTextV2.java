package homeTasks.homeTask8Strings;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AnalyzerOfTextV2 {

    public Scanner scanner = new Scanner(System.in);
    public String text;

    public AnalyzerOfTextV2() {
        System.out.println("Enter text");
        text = scanner.nextLine();
    }

    public void analyzerOfTextRun(){
        countWords();
        findLongestWord();
        countLetterFrequency();
        reverseWords();
        isPalindrome();
    }
    private void countWords(){
        int countText = text.split("\\s").length;
        System.out.println("Quantity of words: " + countText);
    }

    private void findLongestWord(){
         String[] words = text.split("\\s+");
         String longestWord = "";
         for (String word : words){
            if (word.length()>longestWord.length()){
                longestWord=word;
            }
         }
        System.out.println("longest word " + longestWord);
    }

    private void countLetterFrequency(){
        String str = text;
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
    }

    private void reverseWords(){
        String originalStr = text;
        String reversedStr = "";
        for (int y = 0; y < originalStr.length(); y++) {
            reversedStr = originalStr.charAt(y) + reversedStr;
        }
        System.out.println("Reversed string: " + reversedStr);
    }

    private void isPalindrome(){
        String origString = text;
        String reverseString = new StringBuilder(origString).reverse().toString();
        if (origString.trim().replaceAll("\\s+","").toLowerCase()
                .equals(reverseString.trim().replaceAll("\\s+", "").toLowerCase())) {
            System.out.println("String is a palindrome.");
        } else {
            System.out.println("String is not a palindrome.");
        }
    }

}
