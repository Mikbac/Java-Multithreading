package pl.mikbac.threads.Example24;

import lombok.SneakyThrows;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by MikBac on 24.01.2024
 */
public class Item {

    private final Lock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();

    private int value;

    @SneakyThrows
    public void increase() {
        lock.lock();
        try {
            System.out.println(STR."Item can be increased by: \{Thread.currentThread().getName()}");
            value++;
            if (Math.random() < 0.5) {
                System.out.println(STR."Item can be decreased, signal from: \{Thread.currentThread().getName()}");
                condition.signal();
            }
            Thread.sleep(1000);
        } finally {
            lock.unlock();
        }
    }

    @SneakyThrows
    public void decrease() {
        lock.lock();
        try {
            System.out.println(STR."Item can be decreased by: \{Thread.currentThread().getName()}");
            condition.await();
            value--;
            System.out.println(STR."Item decreased by: \{Thread.currentThread().getName()}");
            Thread.sleep(1000);
        } finally {
            lock.unlock();
        }
    }

    public int getValue() {
        return value;
    }

}
