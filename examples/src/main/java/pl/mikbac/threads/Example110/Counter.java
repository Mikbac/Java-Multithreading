package pl.mikbac.threads.Example110;

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
        if (lockObject.tryLock()) {
            try {
                // something that can cause an exception
                // e.g. throw new RuntimeException();
                this.items++;
            } finally {
                lockObject.unlock();
            }
        }
    }

    public void decrement() {
        if (lockObject.tryLock()) {
            try {
                // something that can cause an exception
                // e.g. throw new RuntimeException();
                this.items--;
            } finally {
                lockObject.unlock();
            }
        }
    }

    public int getItems() {
        return items;
    }

}
