package pl.mikbac.threads.Example105;

import java.util.Random;

/**
 * Created by MikBac on 16.01.2024
 */
public class CounterThread extends Thread {

    private Counter counter;
    private Random random = new Random();

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (true) {
            long start = System.currentTimeMillis();

            try {
                Thread.sleep(random.nextInt(100));
            } catch (InterruptedException e) {
            }

            long end = System.currentTimeMillis();

            counter.count(end - start);
        }
    }

}
