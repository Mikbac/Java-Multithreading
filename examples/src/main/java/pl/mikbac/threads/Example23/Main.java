package pl.mikbac.threads.Example23;

import java.util.concurrent.Semaphore;

/**
 * Created by MikBac on 23.01.2024
 */

public class Main {

    private static final int PRODUCER_LIMIT = 10;

    public static void main(String[] args) throws InterruptedException {
        /*
         * @param permits the initial number of permits available.
         *        This value may be negative, in which case releases
         *        must occur before any acquires will be granted.
         */
        final Semaphore consumerSemaphore = new Semaphore(0);
        final Semaphore producerSemaphore = new Semaphore(PRODUCER_LIMIT);
        final Item item = new Item();

        ConsumerThread consumer = new ConsumerThread(consumerSemaphore, producerSemaphore, item);
        ProducerThread producerOne = new ProducerThread(consumerSemaphore, producerSemaphore, item);
        ProducerThread producerTwo = new ProducerThread(consumerSemaphore, producerSemaphore, item);
        PrinterThread printer = new PrinterThread(item);

        consumer.start();
        producerOne.start();
        producerTwo.start();
        printer.start();

        // Item is increase by: Thread-1
        // Item is increase by: Thread-2
        // Item value from printer: 0
        // Item is increase by: Thread-1
        // Item is increase by: Thread-2
        // Item is decreased by: Thread-0
        // Item value from printer: 3
        // Item is increase by: Thread-1
        // Item is increase by: Thread-2
        // Item is decreased by: Thread-0
        // Item value from printer: 4
        // Item is increase by: Thread-1
        // Item is decreased by: Thread-0
        // Item is increase by: Thread-2
        // Item value from printer: 5
        // Item is increase by: Thread-1
        // Item is decreased by: Thread-0
        // Item is increase by: Thread-2
        // Item value from printer: 6
        // Item is decreased by: Thread-0
        // Item is increase by: Thread-2
        // Item is increase by: Thread-1
        // Item value from printer: 7
        // Item is increase by: Thread-2
        // Item is increase by: Thread-1
        // Item is decreased by: Thread-0
        // Item value from printer: 8
        // Item is increase by: Thread-2
        // Item is increase by: Thread-1
        // Item is decreased by: Thread-0
        // Item value from printer: 9
        // Item is increase by: Thread-1
        // Item is decreased by: Thread-0
        // Item value from printer: 9
        // Item is increase by: Thread-1
        // Item is decreased by: Thread-0
        // Item value from printer: 9
        // Item is increase by: Thread-1
        // Item is decreased by: Thread-0
        // Item value from printer: 9
        // Item is increase by: Thread-1
        // Item is decreased by: Thread-0
        // Item value from printer: 9
        // Item is decreased by: Thread-0
        // Item is increase by: Thread-1
        // Item value from printer: 9
        // Item is increase by: Thread-1
        // Item is decreased by: Thread-0
        // Item value from printer: 9
    }
}
