package pl.mikbac.threads.Example24;

/**
 * Created by MikBac on 24.01.2024
 */

public class Main {

    public static void main(String[] args) {

        final Item item = new Item();

        ConsumerThread consumer = new ConsumerThread(item);
        ProducerThread producer = new ProducerThread(item);
        PrinterThread printer = new PrinterThread(item);

        consumer.start();
        producer.start();
        printer.start();

    }

}
