package pl.mikbac.threads.Example28;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by MikBac on 24.01.2024
 */
public class Counter {

    private AtomicInteger value = new AtomicInteger(0);

    public void increment() {
        value.incrementAndGet();
    }

    public void decrement() {
        value.decrementAndGet();
    }

    public int getValue() {
        return value.get();
    }
}
