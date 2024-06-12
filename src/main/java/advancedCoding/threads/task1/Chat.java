package advancedCoding.threads.task1;

public class Chat {
    boolean questionsAsked = false;
    boolean answerPlaced = false;
    public synchronized void question(String msg) {
        if (questionsAsked) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(msg);
        questionsAsked = true;
        answerPlaced = false;
        notify();
    }
    public synchronized void answer(String msg) {
        if (answerPlaced) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(msg);
        answerPlaced = true;
        questionsAsked = false;
        notify();
    }
}
