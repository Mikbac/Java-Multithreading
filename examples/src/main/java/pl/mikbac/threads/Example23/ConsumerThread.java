package pl.mikbac.threads.Example23;

import lombok.SneakyThrows;

import java.util.concurrent.Semaphore;

/**
 * Created by MikBac on 23.01.2024
 */
public class ConsumerThread extends Thread {

    private final Semaphore consumer;
    private final Semaphore producer;
    private final Item item;

    public ConsumerThread(Semaphore consumer, Semaphore producer, Item item) {
        this.consumer = consumer;
        this.producer = producer;
        this.item = item;
    }

    @SneakyThrows
    @Override
    public void run() {
        while (true) {
            consumer.acquire();
            System.out.println(STR."Item is decreased by: \{Thread.currentThread().getName()}");
            item.decrease();
            Thread.sleep(1000);
            producer.release();
        }
    }

}
