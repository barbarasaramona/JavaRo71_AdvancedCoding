package advancedCoding.files.task1;


// Create a solution which will display all files/directories included in the provided directory.

import java.io.File;

public class Main {
    public static void main(String[] args) {

        File file1 = new File("/Users/bogdyhh/Desktop/untitled folder/out/production/Pong");
        String[] listOfStrings = file1.list();
        for (String x : listOfStrings) {
            System.out.println(x);
        }
    }
}
