package pl.mikbac.threads.Example20;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by MikBac on 22.01.2024
 */
public class Counter {
    private final ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
    private Lock readLock = reentrantReadWriteLock.readLock();
    private Lock writeLock = reentrantReadWriteLock.writeLock();

    private int items;

    public Counter(final int items) {
        this.items = items;
    }

    public void increment() {
        writeLock.lock();
        this.items++;
        writeLock.unlock();
    }

    public void decrement() {
        writeLock.lock();
        this.items--;
        writeLock.unlock();
    }

    public int getItems() {
        readLock.lock();
        try {
            return items;
        } finally {
            readLock.unlock();
        }
    }

}
