package pl.mikbac.threads.Example101;

/**
 * Created by MikBac on 16.01.2024
 */
public class Counter {

    private int value;

    public Counter(final int items) {
        this.value = items;
    }

    public void increment() {
        // get current value
        // calculate new value
        // assignee new value
        this.value++;
    }

    public void decrement() {
        // get current value
        // calculate new value
        // assignee new value
        this.value--;
    }

    public int getValue() {
        return value;
    }
}
