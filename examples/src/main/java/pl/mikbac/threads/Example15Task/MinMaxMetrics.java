package pl.mikbac.threads.Example15Task;

/**
 * Created by MikBac on 21.01.2024
 */
public class MinMaxMetrics {

    // Add all necessary member variables

    private volatile long minValue;
    private volatile long maxValue;

    /**
     * Initializes all member variables
     */
    public MinMaxMetrics() {
        this.minValue = Integer.MAX_VALUE;
        this.maxValue = Integer.MIN_VALUE;
    }

    /**
     * Adds a new sample to our metrics.
     */
    public synchronized void addSample(long newSample) {
        synchronized (this) {
            this.minValue = Math.min(newSample, this.minValue);
            this.maxValue = Math.max(newSample, this.maxValue);
        }
    }

    /**
     * Returns the smallest sample we've seen so far.
     */
    public long getMin() {
        return minValue;
    }

    /**
     * Returns the biggest sample we've seen so far.
     */
    public long getMax() {
        return maxValue;
    }

}
