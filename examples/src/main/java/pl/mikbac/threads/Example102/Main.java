package pl.mikbac.threads.Example102;

/**
 * Created by MikBac on 16.01.2024
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {

        // counter is shared object
        final Counter counter = new Counter(0);

        IncrementingCounterThread incrementingCounterThread = new IncrementingCounterThread(counter, 30000);
        DecrementingCounterThread decrementingCounterThread = new DecrementingCounterThread(counter, 30000);

        incrementingCounterThread.start();
        decrementingCounterThread.start();

        incrementingCounterThread.join();
        decrementingCounterThread.join();

        System.out.println(STR."Counter value: \{counter.getItems()}");
        // Counter value: 0
    }

}
