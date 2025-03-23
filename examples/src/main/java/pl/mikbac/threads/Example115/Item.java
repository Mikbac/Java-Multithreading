package pl.mikbac.threads.Example115;

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

    private boolean complete;

    @SneakyThrows
    public void complete() {
        lock.lock();
        try {
            while (complete) {
                condition.await();
            }
            System.out.println(STR."Item completed by: \{Thread.currentThread().getName()}");
            complete = true;
            condition.signal();
            Thread.sleep(1000);
        } finally {
            lock.unlock();
        }
    }

    @SneakyThrows
    public void incomplete() {
        lock.lock();
        try {
            while (!complete) {
                condition.await();
            }
            System.out.println(STR."Item incompleted by: \{Thread.currentThread().getName()}");
            complete = false;
            condition.signal();
            Thread.sleep(1000);
        } finally {
            lock.unlock();
        }
    }

}
