package advancedCoding.threads.task1;

import java.util.ArrayList;
import java.util.List;

public class Thread1 implements Runnable{

    private Chat chat;
    private List<String> questions = new ArrayList<>();

    public Thread1(Chat chat) {
        this.chat = chat;
        
    }

    public void setQuestions(List<String> questions) {
        this.questions = questions;
    }

    @Override
    public void run() {
        for (String q : questions) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            chat.question("Thread1: " + q);
        }
    }
}
