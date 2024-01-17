package pl.mikbac.threads.Example12;

/**
 * Created by MikBac on 16.01.2024
 */
public class Counter {

    private int items;

    final Object lock = new Object();

    public Counter(final int items) {
        this.items = items;
    }

    public synchronized void increment() {
        synchronized (this.lock) {
            // get current value
            // calculate new value
            // assignee new value
            this.items++;
        }
    }

    public synchronized void decrement() {
        synchronized (this.lock) {
            // get current value
            // calculate new value
            // assignee new value
            this.items--;
        }
    }

    public synchronized int getItems() {
        synchronized (this.lock) {
            return items;
        }
    }
}
