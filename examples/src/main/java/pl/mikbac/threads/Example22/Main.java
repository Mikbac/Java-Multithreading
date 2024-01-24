package pl.mikbac.threads.Example22;

import java.util.concurrent.Semaphore;

/**
 * Created by MikBac on 23.01.2024
 */

public class Main {

    public static void main(String[] args) throws InterruptedException {
        /*
         * @param permits the initial number of permits available.
         *        This value may be negative, in which case releases
         *        must occur before any acquires will be granted.
         */
        final Semaphore consumerSemaphore = new Semaphore(0);
        final Semaphore producerSemaphore = new Semaphore(1);
        final Item item = new Item();

        ConsumerThread consumer = new ConsumerThread(consumerSemaphore, producerSemaphore, item);
        ProducerThread producer = new ProducerThread(consumerSemaphore, producerSemaphore, item);
        PrinterThread printer = new PrinterThread(item);

        consumer.start();
        producer.start();
        printer.start();

        // Item is increase by: Thread-1
        // Item value from printer: 0
        // Item is decreased by: Thread-0
        // Item value from printer: 0
        // Item is increase by: Thread-1
        // Item value from printer: 1
        // Item is decreased by: Thread-0
        // Item value from printer: 0
        // Item is increase by: Thread-1
        // Item is decreased by: Thread-0
        // Item value from printer: 0
        // Item is increase by: Thread-1
        // Item value from printer: 1

    }

}
