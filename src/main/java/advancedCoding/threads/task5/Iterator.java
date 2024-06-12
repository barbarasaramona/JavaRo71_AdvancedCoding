package advancedCoding.threads.task5;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Iterator<T> {

    AtomicInteger atomic = new AtomicInteger(0);
    List<T> list = new ArrayList<>();

    public Iterator(List<T> list) {
        this.list = list;
    }

    public void next() {
        System.out.println(list.get(atomic.getAndIncrement()));
    }
    public void prev() {
        System.out.println(list.get(atomic.decrementAndGet()));
    }
}
