package pl.mikbac.threads.Example111;

/**
 * Created by MikBac on 22.01.2024
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {

        // counter is shared object
        final Counter counter = new Counter(0);

        IncrementingCounterThread incrementingCounterThread = new IncrementingCounterThread(counter, 30000);
        DecrementingCounterThread decrementingCounterThread = new DecrementingCounterThread(counter, 30000);
        PrinterCounterThread printerCounterThread = new PrinterCounterThread(counter);

        incrementingCounterThread.start();
        decrementingCounterThread.start();
        printerCounterThread.start();

        incrementingCounterThread.join();
        decrementingCounterThread.join();
        printerCounterThread.join();

    }

}
