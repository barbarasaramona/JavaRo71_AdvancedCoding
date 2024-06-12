package advancedCoding.threads.task1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Chat chat = new Chat();

        Thread1 thread1 = new Thread1(chat);
        Thread2 thread2 = new Thread2(chat);

        List<String> questions = Arrays.asList("Hi!", "How are you ?", "I am also doing fine!");
        List<String> answers = Arrays.asList("Hi!", "I am good, what about you?", "Damn you are fast!");


        thread1.setQuestions(questions);
        thread2.setAnswers(answers);

        new Thread(thread1).start();
        new Thread(thread2).start();

    }
}
