package pl.mikbac.threads.Example102;

/**
 * Created by MikBac on 16.01.2024
 */
public class Counter {

    private int items;

    public Counter(final int items) {
        this.items = items;
    }

    public synchronized void increment() {
        // get current value
        // calculate new value
        // assignee new value
        this.items++;
    }

    public synchronized void decrement() {
        // get current value
        // calculate new value
        // assignee new value
        this.items--;
    }

    public synchronized int getItems() {
        return items;
    }
}
