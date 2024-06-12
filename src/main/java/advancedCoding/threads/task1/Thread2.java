package advancedCoding.threads.task1;

import java.util.ArrayList;
import java.util.List;

public class Thread2 implements Runnable{

    private Chat chat;
    private List<String> answers = new ArrayList<>();

    public Thread2(Chat chat) {
        this.chat = chat;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }

    @Override
    public void run() {
        for (String a : answers) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            chat.answer("Thread2: " + a);
        }
    }
}
