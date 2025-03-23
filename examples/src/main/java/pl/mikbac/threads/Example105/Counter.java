package pl.mikbac.threads.Example105;

/**
 * Created by MikBac on 16.01.2024
 */
public class Counter {

    private long sum = 0;
    private long quantity = 0;
    // volatile here guarantees that calculating average and getting average is atomic
    private volatile double average = 0.0;

    public synchronized void count(long data) {
        this.sum += data;
        this.quantity++;
        this.average = (double) sum / quantity;
    }

    public double getAverage() {
        return average;
    }
}
