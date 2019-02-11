import java.util.*;
import java.io.*;

public class Main {
    // Count Words in a String – Counts the number of individual words in a string.
    // For added complexity read these strings in from a text file and generate a summary.

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args){
        createFile();
        writeFile();
        countWords(readFile());

    }

    public static void countWords(String sentence){
        // A word is one or more letters followed by a space
        int wordCount = 0;
        for(String words : sentence.split("\\s")){
            wordCount++;
        }
        System.out.println("There are: " + wordCount + " words in this string.");

    }

    public static void createFile(){
        try{
            File myFile = new File("myFile.txt");
            if(myFile.createNewFile()){
                System.out.println("File created");
            }else{
                System.out.println("File already exists");
            }
        }catch(IOException e){
            e.printStackTrace();
            System.out.print("There was an error");
        }
    }

    public static void writeFile(){
        try{
            FileWriter myFileWriter = new FileWriter("myFile.txt");
            myFileWriter.write(keyboard.nextLine());
            myFileWriter.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static String readFile(){
        StringBuilder sb = new StringBuilder();
        try{
            File myFile = new File("myFile.txt");
            Scanner fileScanner = new Scanner(myFile);

            // Get all of the lines out of the file and build it into a string
            while(fileScanner.hasNextLine()){
            sb.append(fileScanner.nextLine());
            }

            System.out.println(sb);
            fileScanner.close();

            // Check to see if the string is empty
            if(sb.toString().isEmpty()){
                System.out.println("There was nothing here");
                System.exit(1);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        return sb.toString();
    }

}
