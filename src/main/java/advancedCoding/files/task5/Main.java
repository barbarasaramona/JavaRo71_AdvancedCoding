package advancedCoding.files.task5;

// Create a CSV parser:
// John, Smith, 23
// Sam, asd, 23
// Andrew, Alabala, 55


//With the file above the program should return the three-element list of objects of the User type with fields: name, surname, age.

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader("src/main/java/advancedCoding/files/task5/task5");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] stringArray;
            List<User> users = new ArrayList<>();

            while ((line = bufferedReader.readLine()) != null) {
                stringArray = line.split(", ");
               // User user1 = new User(stringArray[0], stringArray[1], Integer.parseInt(stringArray[2]));
                User user1 = new User()
                        .setFirstName(stringArray[0])
                        .setLastName(stringArray[1])
                        .setAge(Integer.parseInt(stringArray[2]));
                users.add(user1);
            }

            bufferedReader.close();
            fileReader.close();

            System.out.println(users);
            // for each User u in users = for - each
            // while i (index) is 0 and [condition], [do something]
        //----------------------------------------------------------------------------
            StringBuilder sb = new StringBuilder();

            // With the last blank space
//            for (User u : users) {
//                sb.append(u.getFirstName()).append(", ").append(u.getLastName()).append(", ").append(u.getAge()).append("\n");
//            }


            // Removing the last blank space
            for (int i = 0; i < users.size(); i++) {
                sb.append(users.get(i).getFirstName()).append(", ")
                  .append(users.get(i).getLastName()).append(", ")
                  .append(users.get(i).getAge());
                if (i < users.size() - 1) {
                    sb.append("\n");
                }
            }

            FileWriter fw = new FileWriter("src/main/java/advancedCoding/files/task5/task5.2");
            fw.write(sb.toString());
            fw.close();


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
