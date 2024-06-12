package advancedCoding.files.task3;

// Prepare a solution which will add a string to the specified file.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Vlad Mihalcea, Victor Rentea
            FileReader fileReader = new FileReader("src/main/java/advancedCoding/files/task3/empty");

            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            StringBuilder lineBuilder = new StringBuilder();
            while ((line = bufferedReader.readLine())!= null) {
                lineBuilder.append(line).append("\n");
            }
            lineBuilder.append("Hello World!");
            lineBuilder.append("\nasd");
            bufferedReader.close();

            fileReader.close();

            FileWriter fileWriter = new FileWriter("src/main/java/advancedCoding/files/task3/empty");
            fileWriter.write(lineBuilder.toString());
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
