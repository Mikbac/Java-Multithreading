package pl.mikbac.threads.Example111;

/**
 * Created by MikBac on 22.01.2024
 */
public class DecrementingCounterThread extends Thread {

    private Counter counter;
    private int decrements;

    public DecrementingCounterThread(Counter counter, int decrements) {
        this.counter = counter;
        this.decrements = decrements;
    }

    @Override
    public void run() {
        for (int i = 0; i < decrements; i++) {
            counter.decrement();
        }
    }

}
