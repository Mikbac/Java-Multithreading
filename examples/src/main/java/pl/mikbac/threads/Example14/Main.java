package pl.mikbac.threads.Example14;

/**
 * Created by MikBac on 16.01.2024
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {

        // counter is shared object
        final Counter counter = new Counter();

        CounterThread counterThreadOne = new CounterThread(counter);
        CounterThread counterThreadTwo = new CounterThread(counter);
        PrinterCounterThread printerCounterThread = new PrinterCounterThread(counter);

        counterThreadOne.start();
        counterThreadTwo.start();
        printerCounterThread.start();

    }

}
