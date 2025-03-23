package pl.mikbac.threads.Example109;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by MikBac on 22.01.2024
 */
public class Counter {
    private final Lock lockObject = new ReentrantLock();

    private int items;

    public Counter(final int items) {
        this.items = items;
    }

    public void increment() {
        lockObject.lock();
        // get current value
        // calculate new value
        // assignee new value
        this.items++;
        lockObject.unlock();
    }

    public void decrement() {
        lockObject.lock();
        // get current value
        // calculate new value
        // assignee new value
        this.items--;
        lockObject.unlock();
    }

    public int getItems() {
        return items;
    }

}
