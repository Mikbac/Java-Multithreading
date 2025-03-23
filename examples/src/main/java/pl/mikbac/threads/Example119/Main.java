package pl.mikbac.threads.Example119;

/**
 * Created by MikBac on 24.01.2024
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {

        // counter is shared object
        final Counter counter = new Counter();

        IncrementingCounterThread incrementingCounterThread = new IncrementingCounterThread(counter, 30000);
        DecrementingCounterThread decrementingCounterThread = new DecrementingCounterThread(counter, 30000);

        incrementingCounterThread.start();
        decrementingCounterThread.start();

        incrementingCounterThread.join();
        decrementingCounterThread.join();

        System.out.println(STR."Counter value: \{counter.getValue()}");
        // Counter value:0
    }

}
