import java.util.*;

public class Main {
    // Count Words in a String – Counts the number of individual words in a string.
    // For added complexity read these strings in from a text file and generate a summary.

    public static void main(String[] args){
        countWords("I love you stephanie, you are the best girlfriend ever.");
    }

    public static void countWords(String sentence){
        // A word is one or more letters followed by a space
        int wordCount = 0;
        for(String words : sentence.split("\\s")){
            wordCount++;
            System.out.println(words);
        }
        System.out.print("There are: " + wordCount + " words in this string.");

    }
}
