package pl.mikbac.threads.Example103;

/**
 * Created by MikBac on 16.01.2024
 */
public class IncrementingCounterThread extends Thread {

    private Counter counter;
    private int increments;

    public IncrementingCounterThread(Counter counter, int increments) {
        this.counter = counter;
        this.increments = increments;
    }

    @Override
    public void run() {
        for (int i = 0; i < increments; i++) {
            counter.increment();
        }
    }

}
