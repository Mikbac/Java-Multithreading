package pl.mikbac.threads.Example13;

/**
 * Created by MikBac on 16.01.2024
 */
public class Counter {

    private int items;

    public Counter(final int items) {
        this.items = items;
    }

    public synchronized void increment() {
        synchronized (this) {
            // get current value
            // calculate new value
            // assignee new value
            this.items++;
        }
    }

    public synchronized void decrement() {
        synchronized (this) {
            // get current value
            // calculate new value
            // assignee new value
            this.items--;
        }
    }

    public synchronized int getItems() {
        synchronized (this) {
            return items;
        }
    }
}
