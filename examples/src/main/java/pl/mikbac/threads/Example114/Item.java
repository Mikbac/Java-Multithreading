package pl.mikbac.threads.Example114;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by MikBac on 23.01.2024
 */
public class Item {

    private final Lock lockObject = new ReentrantLock();

    private int value;

    public void increase() {
        lockObject.lock();
        this.value++;
        lockObject.unlock();
    }

    public void decrease() {
        lockObject.lock();
        this.value--;
        lockObject.unlock();
    }

    public int getValue() {
        return value;
    }

}
