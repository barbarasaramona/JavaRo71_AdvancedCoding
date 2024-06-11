package advancedCoding.files.task4;

// Prepare a solution which will return the longest word from the provided file.

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {

            // Looking for the longest text:

//            FileReader fileR = new FileReader("src/main/java/advancedCoding/files/task3/empty");
//            BufferedReader read = new BufferedReader(fileR);
//            String stringRead;
//            String longestWord = "";
//            while ((stringRead = read.readLine()) != null) {
//               // stringRead = stringRead.replaceAll(" ", "\n");
//                if (longestWord.length() < stringRead.length()) {
//                    longestWord = stringRead;
//                }
//            }
//            System.out.println(longestWord);
//
//
//            read.close();
//            fileR.close();


            // Looking for the longest word:

            FileReader fileR = new FileReader("src/main/java/advancedCoding/files/task3/empty");
            Scanner scanner = new Scanner(fileR);
            String longestWord = "";
            String currentWord;
            while (scanner.hasNext()) {
                currentWord = scanner.next();
                if (longestWord.length() < currentWord.length()) {
                    longestWord = currentWord;
                }
            }
            System.out.println(longestWord);

            scanner.close();
            fileR.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
